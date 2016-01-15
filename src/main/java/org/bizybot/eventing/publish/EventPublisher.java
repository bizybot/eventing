package org.bizybot.eventing.publish;

import org.bizybot.eventing.listener.EventListener;

public interface EventPublisher {

  void publishEvent(Object event);

  void registerListener(Class<?> eventClazz, EventListener listener);

  void unregisterListener(EventListener listener);

}
