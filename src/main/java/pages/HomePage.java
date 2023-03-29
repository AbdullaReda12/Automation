package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public By JawwyIcon=By.id("jawwy-logo-web");
	By CountryIcon=By.cssSelector("div.country-current");
	By JordonIcon =By.id("jo");
	By UAEIcon=By.id("ae");
	By AlgeriaIcon=By.id("dz");
	public By LightPrice=By.id("currency-لايت");
	public By ClassicPrice=By.id("currency-الأساسية");







	public void AccessCountryIcon() {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(CountryIcon));
		ClickBtutton(CountryIcon);

	}
	public void SelectJordonPackage() {
		ClickBtutton(JordonIcon);

	}
	public void SelectUAEPackage() {
		ClickBtutton(UAEIcon);}
	
	public void SelectAlgeriaPackage() {
		ClickBtutton(AlgeriaIcon);}



}
