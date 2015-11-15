package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		//Or the two solutions commented
		//ApplicationContext applicationContext = new FileSystemXmlApplicationContext ("E:\workspace\HelloSpring\src");
		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		//HelloWorld helloWorld = (HelloWorld) xmlBeanFactory.getBean("helloWorld");
		String idBean = "helloWorld";
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean(idBean);
		helloWorld.setMessage("I'm the first object");
		helloWorld.getMessage();
		HelloWorld helloWorld2 = (HelloWorld)applicationContext.getBean(idBean);
		helloWorld2.setMessage("I'm the second one");
		helloWorld2.getMessage();
		applicationContext.registerShutdownHook();
		
		
		
		
	}

}
