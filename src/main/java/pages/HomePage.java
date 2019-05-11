package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH,using = "//h2[text()[contains(.,'Demo')]]")
	WebElement eleLN;
	@And("verify the login is success as (.*)")
	public HomePage verifyLoggedInName(String expectedText) {
		//WebElement eleLN = locateElement("xpath", "//h2[text()='Demo Sales Manager']");
		verifyPartialText(eleLN, expectedText);
		return this;
	}
	@FindBy(how = How.CLASS_NAME,using = "decorativeSubmit")
	WebElement eleLogOut;
	public LoginPage clickLogOut() {
		//WebElement eleLogOut = locateElement("class", "decorativeSubmit");
		click(eleLogOut);		
		return new LoginPage();
	}
	
	

}








