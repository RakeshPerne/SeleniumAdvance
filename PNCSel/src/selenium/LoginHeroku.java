package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LoginHeroku {
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.geko.driver", "resources\\geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  
  }
  @Test
  public void f() {
	  driver.get("http://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
	  //driver.findElement(By.className("button")).click();
	  driver.findElement(By.xpath(".//*[@id='login']/button")).click();
  }

  @AfterTest
  public void afterTest() {
  
  //driver.quit();
  }

}
