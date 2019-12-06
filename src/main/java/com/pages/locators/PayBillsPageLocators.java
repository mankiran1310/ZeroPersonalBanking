package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPageLocators {
	
	
	//Elements for add new payee
		@FindBy(linkText="Add New Payee")
		public WebElement addPayeeLink;
		@FindBy(id="np_new_payee_name")
		public WebElement payeeName;
		@FindBy(id="np_new_payee_address")
		public WebElement payeeAdd;
		@FindBy(id="np_new_payee_account")
		public WebElement payeeAccNo;
		@FindBy(id="np_new_payee_details")
		public WebElement payeeDetails;
		@FindBy(id="add_new_payee")
		public WebElement addPayeeBtn;
		@FindBy(id="alert_content")
		public WebElement addalert;
		
		//Elements for purchase foreign currency
		@FindBy(linkText="Purchase Foreign Currency")
		public WebElement foreignCurrencyLink;
		@FindBy(id="pc_currency")
		public WebElement purchaseCurrencyType;
		@FindBy(id="pc_amount")
		public WebElement purchaseCurrencyAmount; 
		@FindBy(id="sp_sell_rate")
		public WebElement sellRate;
		@FindBy(id="pc_inDollars_true")
		public WebElement usdRadioBtn;
		@FindBy(id="pc_inDollars_false")
		public WebElement selectedCurrencyRadiobtn;
		@FindBy(id="pc_calculate_costs")
		public WebElement calculateBtn;
		@FindBy(id="pc_conversion_amount")
		public WebElement conversionAmount;
		@FindBy(id="purchase_cash")
		public WebElement purchaseBtn;
		@FindBy(id="alert_content")
		public WebElement purchaseSuccessAlert;

}
