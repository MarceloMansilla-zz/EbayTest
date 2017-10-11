package com.belatrixsf.app.sorter;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Sorter implements Sorteable{
	
	
	public Sorter(List<WebElement> listResult) {
		super();
		this.listResult = listResult;
	}

	List<WebElement> listResult;
	
	public void printResult() {
		for (WebElement webElement : listResult) {
			System.out.println(webElement.getText());
		}
	}

	public void sortByPrice() {
		// TODO Auto-generated method stub
		
	}

	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

}
