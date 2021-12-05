package moduleSript;


import org.junit.Test;

import pageObject.LoginPage;

public class LoginTest {
	@Test
	public void login() {
	LoginPage loginPage = new LoginPage();
	loginPage.appLaunch("https://www.facebook.com/");
	loginPage.login();
	}

}
