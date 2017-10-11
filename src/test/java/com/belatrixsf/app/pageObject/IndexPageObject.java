package com.belatrixsf.app.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPageObject {

	private WebDriver driver;

	private By barSearcher = By.id("gh-ac");
	private By btnSearch = By.id("gh-btn");

	public IndexPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void searchItem() {
		this.driver.findElement(barSearcher).sendKeys("shoes");
		this.driver.findElement(btnSearch).click();
	}

}
