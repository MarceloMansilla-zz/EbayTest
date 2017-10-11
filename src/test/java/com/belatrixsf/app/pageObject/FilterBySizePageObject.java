package com.belatrixsf.app.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterBySizePageObject {

	private By sizeSearch = By.id("e1-27");
	private WebDriver driver;

	public FilterBySizePageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void searchSize() {
		this.driver.findElement(sizeSearch).click();
	}

}
