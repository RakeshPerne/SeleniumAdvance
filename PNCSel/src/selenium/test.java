package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Open Browser");
		
		driver.manage().window().maximize();
		System.out.println("Maximise windows");
		
		Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Open URl");
		
		driver.close();
		System.out.println("Close window");
		
		
	}

}
