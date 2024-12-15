package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage (WebDriver driver) {
		
		super(driver);
	}

	
 @FindBy(xpath="//a[normalize-space()='Register']")
 WebElement lnkMyaccount;
 
 @FindBy(xpath="//a[normalize-space()='Login']")
 WebElement lnkRegister;
 
 
 public void clickMyAccount()
 {
	 lnkMyaccount.click();
 }
	
 public void clickRegister() {
	 lnkRegister.click();
 }
		
}
