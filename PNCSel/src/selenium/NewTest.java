package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
 
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.geko.driver", "resources\\geckodriver.exe");
		driver= new FirefoxDriver();
	driver.manage().window().maximize();
  }
  
  @Test
  public void f() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  
	  		
  }
  
  

  @AfterTest
  public void afterTest() {
	  
		driver.quit();

  }

}
