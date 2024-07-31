package week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSnapdesl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.switchTo().frame(0);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement menFashion =	driver.findElement(By.linkText("Men's Fashion"));//create xpath for this contsin text and word on this // use double code here as single quote is already their
	
	//Actions action = new Actions(driver);

	//Performing the mouse hover action on the target element.
//	action.moveToElement(ele).perform();
	Actions action = new Actions(driver);
	//action.moveToElement(menFashion).click().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
