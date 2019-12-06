package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.LoginPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends Page {
	
	public LoginPageLocators lp;
	public LoginPage() {
		this.lp=new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.lp);
	}
	
	//create method
		public void doLogin(String myusername,String mypassword) {
			log.debug("type username");
			test.log(LogStatus.INFO, "Entering username");
		lp.username.sendKeys(myusername);
			log.debug("type password");
			test.log(LogStatus.INFO, "Entering password");
		lp.password.sendKeys(mypassword);
			log.debug("click submit button");
			test.log(LogStatus.INFO, "Click Submit Button");
		lp.submitBtn.click();
		}

}
