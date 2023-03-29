package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PageBase {
	protected static WebDriver driver;
	public JavascriptExecutor jse;
	

	public PageBase(WebDriver driver) {

		PageBase.driver=driver;
		
		
	}

	

		protected static void ClickBtutton(By button) {
			driver.findElement(button).click();
		}
		protected static void Entertxt(By TxtArea, String Txt){
			driver.findElement(TxtArea).sendKeys(Txt);
		}

		public void ScrollToBottom() {

			jse.executeScript("scrollBy(0,2500)");

		}
		protected static void Cleartxt(By TxtArea){
			driver.findElement(TxtArea).clear();
		}

		public void ScrollToElement(WebElement element) {

			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
		}

		public static void ChooseElement(By Element) {

			driver.findElement(Element);
		}



	}

