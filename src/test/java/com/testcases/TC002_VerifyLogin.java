package com.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.Page;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC002_VerifyLogin extends Page{
	
	@Test
	public void verifyLogin() {
		
		Page.initConfiguration();
		test.log(LogStatus.INFO, "Login Test started");
		HomePage hp = new HomePage();
		hp.clickSignIn();
		LoginPage lp=new LoginPage();
		lp.doLogin("username", "password");
		String actual = Page.driver.getTitle();
		String expected="Zero - Account Summary";
		Assert.assertEquals(actual, expected);
		test.log(LogStatus.INFO, "Login Test completed");
		Page.quitBrowser();
		
	}

}
