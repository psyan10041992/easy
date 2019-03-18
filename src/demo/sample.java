package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\prasanth\\Task1\\easy\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement src = driver.findElement(By.id("email"));
	src.sendKeys("psyan007@gmail.com");
	WebElement desc = driver.findElement(By.id("pass"));
	desc.sendKeys("12345789");
	

}
}