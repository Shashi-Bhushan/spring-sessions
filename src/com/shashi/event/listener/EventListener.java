package com.shashi.event.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener{

	/**
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 * 
	 * This method is called by Spring when any ApplicationEvent is Published.
	 * takes the parameter which is the ApplicationEvent object itself and Spring sends this ApplicationEvent object
	 * 
	 * whatever code is written inside the function is executed on every Event that is published in Spring Framework.
	 * at the moment, it'll print 2 Events - ContextRefreshed and ContextClosed
	 */
	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		System.out.println(applicationEvent.toString());
	}

}
