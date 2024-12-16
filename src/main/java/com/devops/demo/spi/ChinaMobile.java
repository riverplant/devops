package com.devops.demo.spi;

public final class ChinaMobile implements InternetService{

	@Override
	public void connectInternet() {
		System.out.println("connect internet by [China Mobile]");
		
	}

}
