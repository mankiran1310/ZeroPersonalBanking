package com.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.Page;
import com.pages.actions.AccountSummaryPage;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.pages.actions.TransferFundsPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC004_VerifyTransferFunds extends Page{
	
	@Test
	public void verifyTransferFunds() {
		
		Page.initConfiguration();
		test.log(LogStatus.INFO, "TransferFunds Test started");
		HomePage hp = new HomePage();
		hp.clickSignIn();
		LoginPage lp=new LoginPage();
		lp.doLogin("username", "password");
		AccountSummaryPage asp=new AccountSummaryPage();
	    asp.clickTransferFunds();
		TransferFundsPage tf=new TransferFundsPage();
		tf.selectFromAccount(0);
		tf.selectToAccount(3);
		tf.transferFundsInfo("20", "funds transfer");
		
		String expectedAlert=tf.successAlert();
		String actualAlert="You successfully submitted your transaction.";
		Assert.assertEquals(actualAlert, expectedAlert);
		test.log(LogStatus.INFO,"Transfer Funds Test Started");
		Page.quitBrowser();
		
	}

}
