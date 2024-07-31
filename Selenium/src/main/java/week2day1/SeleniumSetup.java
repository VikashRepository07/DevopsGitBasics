package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {

	@Test
	public  void main() {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");
		WebDriverManager.chromedriver().setup();// setup the webdriver manager library
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://leaftaps.com/opentaps/control/main");
		//driver.get("https://testleaf.webex.com");
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	//Create Lead
	driver.findElement(By.linkText("Create Lead")).click();
	//driver.findElement(By.linkText("Company Name"));
	//driver.findElement(By.name("companyName")).click();
	//driver.findElement(By.name("companyName")).sendKeys("TCS");
	//createLeadForm_companyName
	//driver.findElement(By.id("createLeadForm_companyName")).click();
	//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	//driver.findElement(By.linkText("Company Name"));
	
	
	  
			
WebElement firstName =	driver.findElement(By.xpath("//input[contains(@id, 'createLeadForm_firstName')]"));
		firstName.click();
		firstName.sendKeys("CTS");
		WebElement lastName =	driver.findElement(By.xpath("//input[contains(@id, 'createLeadForm_lastName')]"));
		lastName.click();
		lastName.sendKeys("Techology");
		//createLeadForm_companyName
	WebElement companyName = driver.findElement(By.xpath("//input[contain@id,'createLeadForm_companyName']"));	
		
		companyName.click();
		companyName.sendKeys("TCS");
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
	
	
		
		
		 
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
			
			
	}
	
	
				
				

	}

