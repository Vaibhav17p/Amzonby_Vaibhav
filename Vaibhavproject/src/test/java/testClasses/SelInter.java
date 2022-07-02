package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelInter {

	WebDriver driver;
	@BeforeClass
	public void openBro()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.tutorialspoint.com/tutorialslibrary.htm");
	}
	@BeforeMethod 
	public void openBrowser()
	{
		
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void SearchSelenium(WebDriver driver ) throws InterruptedException
	{
		
		WebElement sel =driver.findElement(By.xpath("//input[@id='search-strings']"));
		
		sel.sendKeys("Selnium");
		Thread.sleep(2000);
		
		WebElement Search =driver.findElement(By.xpath("//button[@id='btnSearch']"));
		Search.click();
		
	}	
	@AfterMethod
	public void Close(WebDriver driver)
	{
		driver.close();
	}
}


