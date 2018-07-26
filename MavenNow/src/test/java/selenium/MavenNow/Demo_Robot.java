package selenium.MavenNow;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo_Robot {
  WebDriver driver;
	@Test
  public void Robot() throws AWTException {
		
		java.awt.Robot r= new java.awt.Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		
	  
  }
  @BeforeTest
  public void beforeTest() {
	  //System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	 // driver = new ChromeDriver();
	 // driver.get("https://www.timesjobs.com/candidate/register.html");
	  driver.manage().window().maximize();
	  
  }

}
