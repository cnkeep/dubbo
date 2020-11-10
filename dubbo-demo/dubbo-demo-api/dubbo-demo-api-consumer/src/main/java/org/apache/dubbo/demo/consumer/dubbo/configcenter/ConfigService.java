package org.apache.dubbo.demo.consumer.dubbo.configcenter;

import java.util.Map;

public interface ConfigService {
    Map<Object,Object> getConfig(String serviceName);
}
