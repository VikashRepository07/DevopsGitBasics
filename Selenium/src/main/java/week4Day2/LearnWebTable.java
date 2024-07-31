package week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	//driver.switchTo().frame(0);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement fromStation = 	driver.findElement(By.id("txtStationFrom"));
fromStation.clear();
fromStation.sendKeys("MAS");
fromStation.sendKeys(Keys.ENTER);
WebElement toStation = 	driver.findElement(By.id("txtStationTo"));
toStation.clear();
toStation.sendKeys("CBE");
toStation.sendKeys(Keys.ENTER);

driver.findElement(By.id("chkSelectDateOnly")).click();


}
}