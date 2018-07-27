package selenium.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LoginHerokuapp {
	WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
  }
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.className("button secondary radius")).click();
	  driver.findElement(By.xpath((".//*[@id='content']/div/a/i"))); 
  }
  @AfterTest
  public void afterTest() {
  }

}
