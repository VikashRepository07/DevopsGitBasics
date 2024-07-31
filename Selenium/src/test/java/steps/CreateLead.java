package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public ChromeDriver driver;
	public void aunchBowser()
	{
		 driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		}
	
	public void navigateToUrl()
	 {
		
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
