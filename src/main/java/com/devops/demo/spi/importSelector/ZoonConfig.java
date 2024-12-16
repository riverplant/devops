package com.devops.demo.spi.importSelector;

import org.springframework.context.annotation.Bean;

public class ZoonConfig {

	@Bean
	public Tiger tiger() {
		return new Tiger();
	}
}


 class Tiger {
	
}