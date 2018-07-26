package selenium.MavenNow;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo03_JavaScript {
	WebDriver d;
  @Test

	 // d.manage().window().maximize();
	  
  
  
  public void javascript() {
	  JavascriptExecutor j=(JavascriptExecutor)d;
	  j.executeScript("window.scroll(0,800)");
	  j.executeScript("alert('hello')");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.timesjobs.com/candidate/register.html");
  }

}
