package Singleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass 
{
	public static WebDriver driver=null;

	public static void initilize()
	{
		//Use Of Singleton Concept and Initilize webDriver
		if(driver == null)
		{
			if(ConstantVariable.browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "F:\\Photon_Workspace\\SingletonPracticeProject\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "F:\\Photon_Workspace\\SingletonPracticeProject\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(ConstantVariable.browserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.edge.driver", "F:\\Photon_Workspace\\SingletonPracticeProject\\Drivers\\MicrosoftWebDriver.exe");
				driver=new EdgeDriver();
			}
		}
		
		//Perform Basic Operations
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public static void quit()
	{
		driver.quit();
		driver=null; // we destroy the driver object after quit operation
	}
	
	public static void close()
	{
		driver.close();
		driver=null;  // we destroy the driver object after quit operation
	}
	
	public  static void openurl(String URL)
	{
		driver.get(URL);
	}
}
