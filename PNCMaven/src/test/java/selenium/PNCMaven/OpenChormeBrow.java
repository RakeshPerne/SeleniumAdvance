package selenium.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenChormeBrow {
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() {
	  String url ="http://newtours.demoaut.com/";
	  driver.get(url);
	  //driver.get("http://newtours.demoaut.com/");
  }
  

  @AfterTest
  public void afterTest() {
  }

}
