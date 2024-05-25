package com.e2eTest.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class LoginPage {
	/*retrieve element*/
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Email")
public static WebElement email;
	@CacheLookup
	@FindBy(how = How.ID, using = "Password")
public static WebElement Password;
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
public static WebElement Btnlogin;
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	public static WebElement msg;
	public LoginPage() {
		PageFactory.initElements (Setup.getDriver(), this);

       
	}
	
    
	
	/*Create method*/
	public void goToUrl() {
	Setup.getDriver().get("https://admin-demo.nopcommerce.com/login");
	}
	public void fillEmail(String mail) {
		
		email.clear();
		email.sendKeys(mail);		
		
	}
	public void fillPassword(String pswd) {
		Password.clear();
		Password.sendKeys(pswd);		
		
	}
	public void clickOnBtnLogin () {
		 Btnlogin.click();	
	   }
		
		
	}
	

