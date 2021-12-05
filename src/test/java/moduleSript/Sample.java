package moduleSript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample extends Lib {

	@BeforeClass()
	private void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		
	}
	@AfterClass
	private void afterClass() {
		quit();
	}
	@Test
	private void login() {
	
		WebElement userName = findLocatorId("username");
		userName.sendKeys("geethadhayalan");
		WebElement pass = findLocatorId("password");
		userName.sendKeys("Geetha@24");
		WebElement submitbtn = findLocatorId("login");
		submitbtn.click();
			
	}
	}
	


}
