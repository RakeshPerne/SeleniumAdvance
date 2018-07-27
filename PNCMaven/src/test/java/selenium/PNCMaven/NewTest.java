package selenium.PNCMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	 Select dropdown;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
  driver= new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://demoqa.com/registration/");
  Thread.sleep(2000);
  //
  dropdown = new Select(null);

   
  
  }
  

  
  @Test
  public void f() {
	  
	  driver.findElement(By.name("first_name")).sendKeys("Rakesh");
	  driver.findElement(By.name("last_name")).sendKeys("Perne");
	  driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
	  driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
	  
	 // driver.findElement(By.name("identifier_7");
	 // dropdown.selectByVisibleText("Afghanistan");
	  dropdown.selectByVisibleText("Albania");
	  driver.findElement(By.id("phone_9")).sendKeys("1234567890");
	  driver.findElement(By.id("username")).sendKeys("rakeshperne");
	  driver.findElement(By.id("email_1")).sendKeys("rakesh@gmail.com");
	  driver.findElement(By.name("profile_pic_10")).sendKeys("C:\\Users\\pdc4-training.pdc4\\Pictures\\Screenshots\\Screenshot (1).png");
	  driver.findElement(By.id("description")).sendKeys("Currently lives in Pune");
	  driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("abc@1234");;
	  driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("abc@1234");
	  driver.findElement(By.xpath("/*[@id='pie_register']/li[14]/div/input")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
