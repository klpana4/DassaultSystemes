package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdmethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id = "username")
	WebElement eleUserName;
	@And("Enter the User Name as (.*)")
	public LoginPage typeUserName(String data) {
		//WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}	
	public LoginPage verifyUserNameColor(String data) {
		verifyExactAttribute(eleUserName,"id", data);
		return this;
	}
	
	
	@FindBy(id = "password")
	WebElement elePassword ;
	@And("Enter the Password as (.*)")
	public LoginPage typePassword(String data) {
		//WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogin;
	@And("click on the login button")
	public HomePage clickLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		//HomePage hp = new HomePage();
		return new HomePage();
	}
	
	

}








