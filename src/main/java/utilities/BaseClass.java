package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public String input(WebElement element, String txt) {
		element.clear();
		element.sendKeys(txt);
		return txt;
	}

	public void click(WebElement element) {
		click(element);
	}
	public void appLaunch(String url) {
		driver.get(url);
	}
	public void getTitle() {
		driver.getTitle();
	}
}