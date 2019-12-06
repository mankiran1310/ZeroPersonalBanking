package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPageLocators {
	
	 @FindBy(linkText="Pay Bills")
	   public WebElement paybillLink;
		
	   @FindBy(linkText="Transfer Funds")
	   public WebElement transferFundsLink;
	   

}
