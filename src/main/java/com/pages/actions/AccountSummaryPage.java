package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.AccountSummaryPageLocators;

public class AccountSummaryPage extends Page{
	
	public AccountSummaryPageLocators asp;
	public AccountSummaryPage() {
		this.asp=new AccountSummaryPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.asp);
	}

	public void clickPayBills() {
		log.debug("click pay bills");
		//test.log(LogStatus.INFO, "Clicking pay bills");
		asp.paybillLink.click();
	}
	

	public void clickTransferFunds() {
		log.debug("click transfer funds");
		//test.log(LogStatus.INFO, "Eclicking transfer funds");
		asp.transferFundsLink.click();
	}
	
}
