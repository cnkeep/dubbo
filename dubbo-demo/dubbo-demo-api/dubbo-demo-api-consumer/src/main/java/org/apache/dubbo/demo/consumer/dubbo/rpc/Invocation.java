package org.apache.dubbo.demo.consumer.dubbo.rpc;


public interface Invocation {
    String getServiceName();

    String getMethodName();

    Class<?>[] getParameterTypes();

    Object[] getParameters();
}
