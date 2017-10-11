package com.belatrixsf.app.driverFactory;

import com.belatrixsf.app.driver.Driver;

public class DriverStore {
	FactoryDriver factory;

	public DriverStore(FactoryDriver factory) {
		this.factory = factory;
	}

	public Driver runDriver(String browser, String url) {
		Driver driver;
		driver = factory.createDriver(browser);
		driver.setURL(url);
		driver.startDriver();
		return driver;
	}
}
