package com.belatrixsf.app.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import com.belatrixsf.app.driver.Driver;
import com.belatrixsf.app.driverFactory.DriverStore;
import com.belatrixsf.app.driverFactory.FactoryDriver;
import com.belatrixsf.app.pageObject.FilterByBrandPageObject;
import com.belatrixsf.app.pageObject.FilterBySizePageObject;
import com.belatrixsf.app.pageObject.FilteringResultPageObject;
import com.belatrixsf.app.pageObject.IndexPageObject;
import com.belatrixsf.app.sorter.Sorter;

public class TestEBay {

	private Driver driver;
	private Sorter sorter;

	@BeforeClass
	public void setUp() {
		FactoryDriver chrome = new FactoryDriver();
		DriverStore driver = new DriverStore(chrome);
		this.driver = driver.runDriver("chrome", "https://www.ebay.com/");
	}

	@Test(groups = { "filteringIndexPageTest" })
	public void testAccessingMainPage() {
		this.driver.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		IndexPageObject indexPage = new IndexPageObject(driver.getBrowser());
		indexPage.searchItem();
	}

	@Test(groups = { "filteringBrandTest" })
	public void testFilteringByBrand() {
		driver.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FilterByBrandPageObject filterByBrand = new FilterByBrandPageObject(driver.getBrowser());
		filterByBrand.searchBrand();
		// Assert.assertEquals("Brand", this.driver.getBrowser().getTitle(), "Page Not
		// Found");

	}

	@Test(groups = { "filteringSizeTest" })
	public void testFilteringBySize() {
		driver.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FilterBySizePageObject filterBySize = new FilterBySizePageObject(driver.getBrowser());
		filterBySize.searchSize();
		//Assert.assertEquals("shoe", this.driver.getBrowser().getTitle());

	}

	@Test(groups = { "filteringSizeTest" })
	public void testPrintResult() {
		driver.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FilteringResultPageObject listResult = new FilteringResultPageObject(driver.getBrowser());
		sorter = new Sorter(listResult.printElements());
	}

	@AfterClass
	public void tearDown() {
		// this.driver.getBrowser().quit();
		this.driver.getBrowser().close();
	}

}
