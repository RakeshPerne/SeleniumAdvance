package selenium.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class OpenFire {
	WebDriver driver;
 

	  
  
  
  @Test
  public void f() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.name("tripType")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
