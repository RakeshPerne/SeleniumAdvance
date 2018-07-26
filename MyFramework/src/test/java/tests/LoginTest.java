package tests;

import org.testng.annotations.Test;
import org.testng.Assert;


public class LoginTest {
  @Test
  public void LoginwithValid() {
	  String ER="Tested";
	  String AR= "Tested";
	  
	  Assert.assertEquals(AR, ER);
	  
  }
  @Test
  public void LoginwithInvalid() {
	  String ER="Tested";
	  String AR= "tested123";
	  
	  Assert.assertEquals(AR, ER);
  }

}
