package org.apache.dubbo.demo.consumer.dubbo.filter;


import org.apache.dubbo.demo.consumer.dubbo.rpc.Invocation;
import org.apache.dubbo.demo.consumer.dubbo.rpc.Result;
import org.apache.dubbo.demo.consumer.dubbo.rpc.Invoker;

public interface Filter {
    <T> Result<T> filter(Invoker invoker, Invocation invocation);

    int order();
}
