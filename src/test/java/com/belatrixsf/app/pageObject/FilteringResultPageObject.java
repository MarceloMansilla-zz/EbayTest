package com.belatrixsf.app.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilteringResultPageObject {

	private WebDriver driver;
	private By resultsSearch = By.id("Results");

	public FilteringResultPageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public List<WebElement> printElements() {
		List<WebElement> list = this.driver.findElements(resultsSearch);
		return list;
	}
}
