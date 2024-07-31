package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLead extends BaseClass {

	@Test(dataProvider ="FetchData") // this data provider is attribute 
	public  void  CreateLead( String cName,String name,String r) {
		
	//	WebDriverManager.chromedriver().setup();// setup the webdriver manager libr
		
	//	ChromeDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("http://leaftaps.com/opentaps/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
	//	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(r);
		driver.findElement(By.name("submitButton")).click();
	//	driver.close();
		
	}
		
		
		@DataProvider(name="FetchData")// this is paratameterization 
	    public String[][] sendData() {
	        String[][] data = new String[3][3];
	        
	        data[0][0] = "TestLeaf";
	        data[0][1] = "Haja";
	       data[0][2] = "J";
	        
	        data[1][0] = "QEagle";
	        data[1][1] = "Hari";
	        data[1][2] = "R";
	        
	        data[2][0] = "testing";
	        data[2][1] = "data";
	        data[2][2] = "S";
	        
	        
	        return data;
	    }
}// control 2 l 







