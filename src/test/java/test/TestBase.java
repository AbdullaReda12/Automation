package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void StartDriver(@Optional("chrome") String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			String ChromePath= System.getProperty("user.dir")+"/source/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			driver= new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			String FirefoxPath= System.getProperty("user.dir")+"/source/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", FirefoxPath);	
			driver= new FirefoxDriver();
			
		}

	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://subscribe.stctv.com/");
	}

	@AfterSuite
	public void CloseDriver() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterMethod
	public void ScreenShotOnFailure(ITestResult Result) {
		if (Result.getStatus()== ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking ScreenShot....");
			Helper.CaptureScreenShots(driver, Result.getName());
			
		}
		
		
	}
}
