package com.belatrixsf.app.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome extends Driver {

	@Override
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.setBrowser(driver);
		driver.manage().window().maximize();
		driver.get(this.getURL());

	}

}
