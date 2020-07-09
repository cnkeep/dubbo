package org.apache.dubbo.classloader;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.utils.ClassUtils;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: <a href="mailto:zhangleili@lizhi.fm">LeiLi.Zhang</a>
 * @date: 2020/7/7
 * @version:
 **/
public class ClassLoaderTest {

    @Test
    public void getResourcesTest() throws IOException {
        ClassLoader classLoader = ClassUtils.getClassLoader(ClassLoaderTest.class);
        Enumeration<URL> resources = classLoader.getResources("properties.load");
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            String file = url.getFile();
            System.out.println(loadFile(url));
        }
    }

    public Map<String, String> loadFile(URL url) {
        Map<String, String> classes = new HashMap<>();
        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    final int ci = line.indexOf('#');
                    if (ci >= 0) {
                        line = line.substring(0, ci);
                    }
                    line = line.trim();
                    if (line.length() > 0) {
                        try {
                            String name = null;
                            int i = line.indexOf('=');
                            if (i > 0) {
                                name = line.substring(0, i).trim();
                                line = line.substring(i + 1).trim();
                            }
                            if (line.length() > 0) {
                                classes.put(name, line);
                            }
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return classes;
    }
}
