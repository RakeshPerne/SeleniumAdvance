package selenium.MavenNow;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo04_TakeScreen {
	static WebDriver d;
	static int counter=1;
  @Test
  public void javascrpt() throws IOException {
	  takescreenshot();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.timesjobs.com/candidate/register.html");
	  d.manage().window().maximize();
  }
  
  public static void takescreenshot() throws IOException {
	  //org.openqa.selenium.TakesScreenshot t= (org.openqa.selenium.TakesScreenshot)d;
	 org.openqa.selenium.TakesScreenshot t= (org.openqa.selenium.TakesScreenshot)d;
	  File f= t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Rakesh\\"+counter+".jpg"));
	  counter=counter+1;
	
}
  

}
