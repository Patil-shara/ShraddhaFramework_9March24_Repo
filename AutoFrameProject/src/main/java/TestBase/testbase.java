package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testbase {
 public static WebDriver driver;
		@BeforeMethod
	public void setUp()
	{
			String browser_name="Chrome";
			if (browser_name.equals("Chrome"))
			{
				driver=new ChromeDriver();
			}	
			else if(browser_name.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}		
			else if(browser_name.equals("edge"))
			{
				driver=new EdgeDriver();
			}		
			else
			{
				System.out.println("Please enter correct browser name");
			}
			driver.get("https://naveenautomationlabs.com/opencart/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
}





