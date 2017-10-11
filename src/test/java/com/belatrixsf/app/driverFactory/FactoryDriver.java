package com.belatrixsf.app.driverFactory;

import com.belatrixsf.app.driver.Driver;
import com.belatrixsf.app.driver.DriverChrome;

public class FactoryDriver {

	public Driver createDriver(String nameDriver) {

		// XMLReader reader = new XMLReader();

		Driver driver = null;
		if (nameDriver.toLowerCase().equals("chrome")) {
			driver = new DriverChrome();
		} /*
			 * else if (parseName.equals("firefox")) { driver = new DriverFirefox(); } else
			 * if (parseName.equals("internet explore")) { driver = new DriverIE(); } else
			 * if (parseName.equals("opera")) { driver = new DriverOpera(); } else
			 * if(reader.readNode("browser").toUpperCase().equals("PHANTOMJS")) {
			 * DesiredCapabilities caps = new DesiredCapabilities();
			 * caps.setJavascriptEnabled(true);
			 * caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
			 * "Drivers/phantomjs.exe"); driver = new PhantomJSDriver(caps);
			 */else {
			throw new NullPointerException("Driver not found");
		}
		return driver;
	}
}
