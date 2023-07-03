package com.facebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import facebook.base.base;

public class Hooks extends base {
	
	
	base b = new base ();
	
	
	@Before
	public void launch (Scenario scenario) {
		b.launch();
		final byte[] befsc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(befsc, "image/png");
	
	
	}
@After
   public void close (Scenario scenario) {
	
	final byte[] afsc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(afsc, "image/png");
	
	
}

}
