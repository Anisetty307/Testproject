package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	public  AccountRegistrationPage(WebDriver driver) {
	
		super(driver);
	}
	

@FindBy(xpath="")
WebElement txtFirstname;

@FindBy(xpath="")
WebElement txtLastname;

@FindBy(xpath="")
WebElement txtEmail;

@FindBy(xpath="")
WebElement txtTelephone;

@FindBy(xpath="")
WebElement txtpassword;

@FindBy(xpath="")
WebElement txtXconfirmPassword;

@FindBy(xpath="")
WebElement chkdPolicy;

@FindBy(xpath="")
WebElement btnContinue;

@FindBy(xpath="")
WebElement msgConfirmation;


public void setFirtName(String fname) {
txtFirstname.sendKeys(fname);
}
	
public void setLastName(String Lname) {
	txtLastname.sendKeys(Lname);
}

public void setEmail(String email) {
	txtEmail.sendKeys(email);
}

public void setTelephone(String tel) {
 txtTelephone.sendKeys(tel);
}
	
public void setpassword(String pwd) {
	txtpassword.sendKeys(pwd);
}

public void setPrivacyPolicy() {
	chkdPolicy.click();
}

public void clickcontiue() {
	btnContinue.click();
}
	

public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	}catch(Exception e) {
		return (e.getMessage());
	}
}
	
	
	
}
