package test;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class ValidatePackages extends TestBase {
	HomePage HomeObject;


	@Test(priority=1,alwaysRun=true)
	public void ValidateJordonPackages() {
		HomeObject=new HomePage(driver);
		HomeObject.AccessCountryIcon();
		HomeObject.SelectJordonPackage();
		Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("2.7"));
		Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("5.2"));
		Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("دولار أمريكي/شهر"));
		Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("دولار أمريكي/شهر"));

	}

	@Test(priority=2,alwaysRun=true)
	public void ValidateUAEPackages() {
		HomeObject=new HomePage(driver);
		HomeObject.AccessCountryIcon();
		HomeObject.SelectUAEPackage();
		Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("5.4"));
		Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("10.9"));
		Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("دولار أمريكي/شهر"));
		Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("دولار أمريكي/شهر"));
		}


		@Test(priority=3,alwaysRun=true)
		public void ValidateALgeriaPackages() {
			HomeObject=new HomePage(driver);
			HomeObject.AccessCountryIcon();
			HomeObject.SelectAlgeriaPackage();
			Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("2.7"));
			Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("5.3"));
			Assert.assertTrue(driver.findElement(HomeObject.LightPrice).getText().contains("دولار أمريكي/شهر"));
			Assert.assertTrue(driver.findElement(HomeObject.ClassicPrice).getText().contains("دولار أمريكي/شهر"));

		}
	}