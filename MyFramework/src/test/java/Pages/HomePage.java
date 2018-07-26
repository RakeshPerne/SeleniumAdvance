package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver d;
	
	@FindBy(linkText="Register")
	WebElement linkReg;
	
	
	public void clickRegistration()
	{
		linkReg.click();
	}
	public HomePage(WebDriver driver) {
		this.d= driver;
	}
}
