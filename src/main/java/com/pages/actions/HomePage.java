package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.HomePageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends Page{
	
	public HomePageLocators hp;
	public HomePage() {
		this.hp=new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.hp);
	}
	
	//create a method
		public void clickSignIn() {
			log.debug("clicking signin button");
			test.log(LogStatus.INFO, "Clicking on SignIn Button");
		hp.signInBtn.click();
		}
		
		public void goToOnlineBanking() {
			hp.onlineBanking.click();
		}
		
		public void goToFeedback() {
			hp.feedback.click();
		}

}
