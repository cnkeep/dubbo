package org.apache.dubbo.demo.consumer.dubbo.rpc;

import org.apache.dubbo.demo.consumer.dubbo.URL;

public interface Protocol {
    int getDefaultPort();

    <T> Exporter<T> export(Invoker<T> invoker);

    <T> Invoker<T> refer(Class<T> type, URL url);

    void destroy();

}