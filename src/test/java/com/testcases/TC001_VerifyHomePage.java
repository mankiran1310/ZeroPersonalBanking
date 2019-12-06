package com.testcases;

import org.testng.annotations.Test;
import com.base.Page;
import com.pages.actions.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class TC001_VerifyHomePage extends Page {
	
	@Test
	public void verifyHome() {

		Page.initConfiguration();
		test.log(LogStatus.INFO, "SignIn Test started");
		HomePage hp=new HomePage();
		hp.clickSignIn();
		test.log(LogStatus.INFO, "SignIn Test ended");
		Page.quitBrowser();	

	}
	

}
