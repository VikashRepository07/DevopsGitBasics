package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	
	
	@BeforeMethod
	public void launchURL()
	{
	WebDriverManager.chromedriver().setup();// setup the webdriver manager libr
	
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
	
}
	
	public void navigateLead()
	{ 
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	
	public void navigatetocreateLead()
	
	
	{
		driver.findElement(By.linkText("Create Lead")).click();
		

		
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	
     	{
		    driver.close();
	    }
		
	}
