package org.bizybot.eventing.internal;

import org.bizybot.eventing.listener.EventListener;

public class EventListenerInvoker {
  private EventListener listener;
  public EventListenerInvoker(EventListener listener) {
    this.listener = listener;
  }
  public void invokeListener(Object event) {
    this.listener.handleEvent(event);
  }
}
