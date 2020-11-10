package org.apache.dubbo.demo.consumer.dubbo.cluster;

import org.apache.dubbo.demo.consumer.dubbo.rpc.Invoker;

import java.util.List;


public interface Router {

    List<Invoker> route(List<Invoker> invokers);
}
