package org.apache.dubbo.demo.consumer.dubbo.rpc;


public interface Invoker<T> {

    Class<T> getInterface();

    Result invoke(Invocation invocation);
}
