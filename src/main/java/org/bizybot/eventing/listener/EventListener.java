package org.bizybot.eventing.listener;

public interface EventListener<T> {

  void handleEvent(T event);

  boolean supports(Class<T> clazz);

}
