package org.apache.dubbo.demo.consumer.eventbus;

import com.google.common.eventbus.EventBus;
import org.apache.dubbo.demo.consumer.eventbus.event.EnterEvent;
import org.apache.dubbo.demo.consumer.eventbus.listener.EnterEventListener;
import org.apache.dubbo.demo.consumer.eventbus.listener.ExitEventListener;


public class EventBusContext {
    private static final EventBus EVENT_BUS = new EventBus();

    public static final void subscribe(Object o){
        EVENT_BUS.register(o);
    }

    public static final void post(Object event){
        EVENT_BUS.post(event);
    }

    public static void main(String[] args) {
        EnterEventListener enterEventListener = new EnterEventListener();
        ExitEventListener exitEventListener = new ExitEventListener();
        subscribe(enterEventListener);
        subscribe(exitEventListener);

        post(new EnterEvent());
    }
}
