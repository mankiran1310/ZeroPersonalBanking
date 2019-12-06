package com.datadriventests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import com.base.Page;
import com.pages.actions.HomePage;
import com.pages.actions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelReader;

public class TC001_LoginTest_data extends Page{
	
	@Test(dataProvider= "passData" )
	public void verifyLogin(String myusername,String mypassword) {
		Page.initConfiguration();
		test.log(LogStatus.INFO, "Login Test started");
		HomePage hp = new HomePage();
		hp.clickSignIn();
		LoginPage lp=new LoginPage();
		lp.doLogin(myusername,mypassword);
		String actual = Page.driver.getTitle();
		String expected="Zero - Account Summary";
		Assert.assertEquals(actual, expected);
		test.log(LogStatus.INFO, "Login Test completed");
		Page.quitBrowser();
		
	}
	@DataProvider(name="passData")
		public Object[][] passdata(){
			ExcelReader reader=new ExcelReader("/Users/buneetchandhok/Desktop/Testing/TestData.xlsx");
					int rows=reader.getRowCount(0);
					Object[][] data = new Object[rows][2];
					for(int i=0; i<rows; i++)
						{
					data[i][0]=reader.getData(0, i, 0);									                   
					data[i][1]=reader.getData(0, i, 1);
						}
					return data;

					}	
	

}
