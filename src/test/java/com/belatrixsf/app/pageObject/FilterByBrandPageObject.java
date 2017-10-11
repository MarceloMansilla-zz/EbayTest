package com.belatrixsf.app.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterByBrandPageObject {

	private WebDriver driver;
	private By brandSearch = By.id("e1-29");

	public FilterByBrandPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void searchBrand() {
		this.driver.findElement(brandSearch).click();

	}

}
