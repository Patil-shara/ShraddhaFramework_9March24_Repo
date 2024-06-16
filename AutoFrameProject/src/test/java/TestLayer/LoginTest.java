package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.testbase;

public class LoginTest extends testbase {
@Test

public void VerifyLoginTestWithAllValidations()
{
	String Expected_result="My Account";
  PageLayer.Homepage homepage_obj=new PageLayer.Homepage(driver);
  PageLayer.Loginpage loginpage_obj=new PageLayer.Loginpage(driver);
  
  homepage_obj.clickonMyAccountLink();
  homepage_obj.clickonLoginLink();
  
  loginpage_obj.EnterEmailAddress("davidtest3@gmail.com");
  loginpage_obj.EnterPassword("Test@1234");
  loginpage_obj.clickonLoginButton();
  
  
	String Actual_result=driver.getTitle();
	System.out.println("Actual Result is :-"+Actual_result);
	Assert.assertEquals(Actual_result,Expected_result);
}
}

