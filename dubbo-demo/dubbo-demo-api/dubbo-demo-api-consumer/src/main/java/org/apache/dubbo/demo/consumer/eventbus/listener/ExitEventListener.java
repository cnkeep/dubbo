package org.apache.dubbo.demo.consumer.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import org.apache.dubbo.demo.consumer.eventbus.event.ExitEvent;


public class ExitEventListener implements Listener<ExitEvent> {
    @Override
    @Subscribe
    public void receive(ExitEvent event) {
        System.out.println(event.getClass());
    }
}
