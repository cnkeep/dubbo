package org.apache.dubbo.demo.consumer.dubbo.registry;

import org.apache.dubbo.demo.consumer.dubbo.URL;

import java.util.List;

public interface NotifyListener {
    void notify(List<URL> urls);
}