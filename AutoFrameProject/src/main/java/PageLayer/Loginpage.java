package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_add_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login_btn;
	
	public void EnterEmailAddress(String email)
	{
		email_add_txtbox.click();
	}
	public void EnterPassword(String Password)
	{
		password_txtbox.click();
	}
	public void clickonLoginButton()
	{
		login_btn.click();
	}
	
}
	
	
	
	
	
	
	
	
	
	

