package com.shashi.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * This class gets called after every bean initialization i.e. even when Points are initialized, this class will be called for them.
 * 
 * see the flow how Points are created before Triangle objects, And how before and after Init Methods are called
 */
public class ApplicationBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName)
			throws BeansException {
		System.out.println("In BeanPost Processor After Init Method. Bean Name is : " + beanName);
		return beanObject;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName)
			throws BeansException {
		System.out.println("In BeanPost Processor Before Init Method. Bean Name is : " + beanName);
		return beanObject;
	}

}
