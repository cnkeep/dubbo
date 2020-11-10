package org.apache.dubbo.demo.consumer.dubbo.proxy;


import org.apache.dubbo.demo.consumer.dubbo.URL;
import org.apache.dubbo.demo.consumer.dubbo.rpc.Invoker;


public interface ProxyFactory {
    /**
     * for consumer side
     * @param invoker
     * @param interfaces
     * @param <T>
     * @return
     */
    <T> T getProxy(Invoker<T> invoker, Class<?>[] interfaces);


    /**
     * for provider side
     * @param proxy
     * @param type
     * @param url
     * @param <T>
     * @return
     */
    <T> Invoker<T> getInvoker(T proxy, Class<T> type, URL url);
}
