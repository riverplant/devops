package com.devops.demo.spi;

public non-sealed class BeijingChinaMobile implements InternetService{

	@Override
	public void connectInternet() {
		System.out.println("connect internet by [Beijing China Mobile]");
		
	}

}
