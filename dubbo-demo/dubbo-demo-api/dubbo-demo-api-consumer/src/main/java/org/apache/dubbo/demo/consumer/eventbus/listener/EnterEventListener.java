package org.apache.dubbo.demo.consumer.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import org.apache.dubbo.demo.consumer.eventbus.event.EnterEvent;


public class EnterEventListener implements Listener<EnterEvent> {
    @Override
    @Subscribe
    public void receive(EnterEvent event) {
        System.out.println(event.getClass());
    }
}
