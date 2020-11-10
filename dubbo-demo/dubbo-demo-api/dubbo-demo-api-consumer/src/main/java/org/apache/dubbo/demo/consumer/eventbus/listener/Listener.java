package org.apache.dubbo.demo.consumer.eventbus.listener;

import org.apache.dubbo.demo.consumer.eventbus.event.Event;


public interface Listener<T extends Event> {
    void receive(T event);
}
