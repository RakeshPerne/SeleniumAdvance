package tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Registration;
import Utilities.ExcelUti;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
	WebDriver d;
	HomePage h;
	Registration r;
	ExcelUti e;
  @Test
  public void TestReg() throws IOException {
	  h.clickRegistration();
	 // r.registration(null, null, null, null, null);
	  e.getTestdata();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  //h= new HomePage(); normal intializaton
	
	  h=PageFactory.initElements(d, HomePage.class);//pagefactory
	  r=PageFactory.initElements(d, Registration.class);
	  e= new ExcelUti();
	  
  }

}
