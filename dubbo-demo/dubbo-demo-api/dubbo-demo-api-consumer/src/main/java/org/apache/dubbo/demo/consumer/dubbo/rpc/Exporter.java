package org.apache.dubbo.demo.consumer.dubbo.rpc;


public interface Exporter<T> {
    Invoker<T> getInvoker();

    void unexport();

}