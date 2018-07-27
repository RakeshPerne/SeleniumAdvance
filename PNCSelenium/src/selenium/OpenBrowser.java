package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();//Open browser
		driver.get("https://www.google.com");

	}

}
