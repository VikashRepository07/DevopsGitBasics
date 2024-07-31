package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//driver.switchTo().frame(0);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
	WebElement clickButton =	driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
	
	clickButton.click();
	Alert alert = driver.switchTo().alert();// this is not an object creation thi is just we are just swtiching to alert 
	Thread.sleep(3);
	alert.getText();
	alert.sendKeys("Vikash chaturvedi");
	Thread.sleep(3);
	System.out.println(alert);
	Thread.sleep(2000);
	alert.accept();

	
		
		
	}

}
