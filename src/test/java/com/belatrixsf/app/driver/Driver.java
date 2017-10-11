package com.belatrixsf.app.driver;

import org.openqa.selenium.WebDriver;

public abstract class Driver {

	private String URL;
	private WebDriver driver;

	public abstract void startDriver();

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public WebDriver getBrowser() {
		return driver;
	}

	public void setBrowser(WebDriver browser) {
		this.driver = browser;
	}
}
