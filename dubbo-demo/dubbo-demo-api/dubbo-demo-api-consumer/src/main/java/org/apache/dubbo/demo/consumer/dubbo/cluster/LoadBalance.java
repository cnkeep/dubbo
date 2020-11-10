package org.apache.dubbo.demo.consumer.dubbo.cluster;

import org.apache.dubbo.demo.consumer.dubbo.rpc.Invoker;

import java.util.List;

public interface LoadBalance {
    <T> Invoker<T> select(List<Invoker<T>> invokers);
}
