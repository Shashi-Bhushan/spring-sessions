package com.shashi.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/*
 * Overriding default behavior when BeanFactory is initialized
 * called whenever BeanFactory(or ApplicationContext) is initialized
 * 
 * PropertyPlaceholderConfigurer : OOTB BeanFactoryPostProcessor that Spring Provides
 * for Eg. i don't want to add the Point values "0,0" in spring.xml 
 * i want to add the values somewhere else in an xml file and then load it in spring.xml
 */
public class ApplicationBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		System.out.println("Application Bean Factory initialized. Bean Factory is : " + beanFactory.getClass());
	}

}
