package com.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.Page;
import com.pages.actions.AccountSummaryPage;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.pages.actions.PayBillsPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC005_VerifyPurchaseForeignCurrency extends Page{
	
	@Test
	public void verifyPurchaseForeignCurrency() {
		
		Page.initConfiguration();
		test.log(LogStatus.INFO, "TransferFunds Test started");
				HomePage hp = new HomePage();
				hp.clickSignIn();
				LoginPage lp=new LoginPage();
				lp.doLogin("username", "password");
				AccountSummaryPage asp=new AccountSummaryPage();
				asp.clickPayBills();
				PayBillsPage pb=new PayBillsPage();
				pb.clickForeignCurrencyLink();
				pb.selectCurrencyType(2);
				pb.foreignCurrency("100");
				
				String expectedAlert=pb.foreignCurrencySuccessAlert();
				String actualAlert="Foreign currency cash was successfully purchased.";
				Assert.assertEquals(actualAlert, expectedAlert);
		test.log(LogStatus.INFO, "TransferFunds Test started");	
		Page.quitBrowser();
		
	}

}
