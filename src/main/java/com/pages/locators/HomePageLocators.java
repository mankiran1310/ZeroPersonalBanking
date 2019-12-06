package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	//locate Web Elements
		@FindBy(id="signin_button")
		public WebElement signInBtn;
		@FindBy(xpath="//strong[contains(text(),'Online Banking')]")
		public WebElement onlineBanking;
		@FindBy(xpath="//strong[contains(text(),'Feedback')]")
		public WebElement feedback;
		@FindBy(id="account_activity_link")
		public WebElement accActivity;
	

}
