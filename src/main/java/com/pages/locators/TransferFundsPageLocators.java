package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFundsPageLocators {
	
	@FindBy(id="tf_fromAccountId")
	public WebElement tffromAccount;
	@FindBy(id="tf_toAccountId")
	public WebElement tftoAccount;
	@FindBy(id="tf_amount")
	public WebElement tfAmount;
	@FindBy(id="tf_description")
	public WebElement tfdescription;
	@FindBy(id="btn_submit")
	public WebElement tfContinuebtn;
	@FindBy(id="btn_submit")
	public WebElement tfSubmitbtn;
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement tfSuccessAlert;

}
