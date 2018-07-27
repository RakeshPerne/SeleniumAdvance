package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeJunitTC {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver();
	driver.manage().window().maximize();
	}

	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
	
		driver.get("http://newtours.demoaut.com/");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
