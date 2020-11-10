package org.apache.dubbo.demo.consumer.dubbo.cluster;


import org.apache.dubbo.demo.consumer.dubbo.URL;
import org.apache.dubbo.demo.consumer.dubbo.rpc.Invoker;

import java.util.List;

public interface Directory {
    <T> void join(Invoker<T> invoker);

    <T> List<Invoker<T>> lookup(URL url);
}
