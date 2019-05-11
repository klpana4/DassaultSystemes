package testcase;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.LoginPage;
import wdmethods.ProjectMethods;

public class TC001_LoginAndLogOut extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginAndLogOut";
		testCaseDesc =  "Login to OpenTaps";
		category = "smoke";
		author = "sethu";
		dataSheetName = "TC001";
	}
	@Test(dataProvider = "fetchData")
	public void loginAndLogOut(String uName,String pwd) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLogOut();
	}
	
}







