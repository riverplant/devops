package com.devops.demo.spi;

public sealed interface InternetService permits  ChinaMobile, BeijingChinaMobile{

	void connectInternet();
}
