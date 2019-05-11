package wdmethods;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import util.ReadExcel;

public class ProjectMethods extends SeMethods{

	public String dataSheetName;
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}
	@BeforeClass
	public void beforeClass() {
	}
	@BeforeMethod
	public void login() {
		startTestCase();
		startApp("chrome", "http://www.leaftaps.com/opentaps");
	}
	
	@AfterMethod(groups="common")
	public void close() {
		closeAllBrowsers();
	}
	@AfterSuite
	public void afterSuite() {
		endResult();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException {
	return ReadExcel.getExcelData(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
}