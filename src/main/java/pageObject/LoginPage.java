package pageObject;

import pageFactory.LoginPageElements;
import utilities.BaseClass;

public class LoginPage extends BaseClass {

	LoginPageElements  loginPageElements = new LoginPageElements();
	
	public void login() {
		String user = input(loginPageElements.getUserName(), "UserName");
		String pass = input(loginPageElements.getPassWord(), "Password");
		click(loginPageElements.getLoginBtn());
	}
	
}
