package com.devops.demo.spi.importSelector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ConfigB.class);
		
		ZoonConfig zConfig = ctx.getBean(ZoonConfig.class);
		
		Tiger tiger = ctx.getBean(Tiger.class);
		
	}
}
