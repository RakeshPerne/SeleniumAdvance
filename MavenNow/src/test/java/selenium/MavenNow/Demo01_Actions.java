package selenium.MavenNow;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class Demo01_Actions {
	
	WebDriver driver;
  @Test
  public void Actions() throws InterruptedException, AWTException {
      org.openqa.selenium.interactions.Actions a=new org.openqa.selenium.interactions.Actions(driver);
	     
	  
	  WebElement email= driver.findElement(By.id("emailAdd"));
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("newuser").build().perform();
	 	  
	  driver.findElement(By.id("resumeFile_basic")).click();
	  Thread.sleep(2000);
	  setClipboardData("C:\\Users\\pdc4-training.pdc4\\Pictures\\Screenshots\\Screenshot (2).png");
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	 
	  r.keyPress(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.timesjobs.com/candidate/register.html");
	  driver.manage().window().maximize();
	  
	  
  }
  
  public static void setClipboardData(String name) {
	  
	StringSelection  stringsel= new StringSelection(name);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel, null);
	
}

}
