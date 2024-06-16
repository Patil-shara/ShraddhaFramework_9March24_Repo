package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[contains(text(),'Register']")
	private WebElement register_link;
	
	public void clickonMyAccountLink()
	{
		myaccount_link.click();
	}
	public void clickonLoginLink()
	{
		login_link.click();
	}
	public void clickonRegisterLink()
	{
		register_link.click();
	}
	
}
	
	
	
	
