package com.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.Page;
import com.pages.actions.AccountSummaryPage;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.pages.actions.PayBillsPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC003_VerifyAddNewPayee extends Page{
	
	@Test
	public void verifyAddNewPayee() {
		
		Page.initConfiguration();
		//test.log(LogStatus.INFO, "AddNewPayee Test started");
		HomePage hp = new HomePage();
		hp.clickSignIn();
		LoginPage lp=new LoginPage();
		lp.doLogin("username", "password");
		AccountSummaryPage asp=new AccountSummaryPage();
		asp.clickPayBills();
		PayBillsPage pb=new PayBillsPage();
		pb.addPayee("HydroOne Utility", "200 RoberSpec Pkwy, Mississauga, ON L6R1K9", "123234434", "Natural Gas Utility");
		
		String expectedAlert=pb.addPayeeSuccessAlert();
		String actualAlert="The new payee HydroOne Utility was successfully created.";
		Assert.assertEquals(actualAlert, expectedAlert);
		test.log(LogStatus.INFO,"AddNewPayee Test completed");
		Page.quitBrowser();
	}

}
