package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
WebDriver d;
	//static
	//@FindBy(id="gender-male")
	//WebElement chkbx_gender;
	
	
	@FindBy(id="FirstName")
	static
	WebElement Textbox_FirstName;
	
	static
	@FindBy(id="LastName")
	WebElement Textbox_lastName;
	
	static
	@FindBy(id="Email")
	WebElement email;
	
	static
	@FindBy(id="Password")
	WebElement passw;
	
	static
	@FindBy(id="ConfirmPassword")
	WebElement conpassw;
	
	static
	@FindBy(id="register-button")
	WebElement reg_btn;
	
	
	public static void registration( String F, String L, String E, String P, String CP)
	{
		//chkbx_gender.click();
		Textbox_FirstName.sendKeys(F);
		Textbox_lastName.sendKeys(L);
		email.sendKeys(E);
		passw.sendKeys(P);
		conpassw.sendKeys(CP);
		reg_btn.click();
		
	}
	
	public Registration(WebDriver driver) {
		this.d=driver;
	}
}
