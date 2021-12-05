package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPageElements extends BaseClass{
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(name="email")
	private WebElement userName;
	
	@FindBy(name="pass")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	
	
	
	
	
}
