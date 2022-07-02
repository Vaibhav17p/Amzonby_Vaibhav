package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public static WebDriver openChrome() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver61.exe");
		WebDriver driver= new ChromeDriver();
		return driver;
	}
	
   public static WebDriver openFireFox() {
		
		System.setProperty("webdriver.gecko.driver","D:\\chrome\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		return driver;
	}
   public static WebDriver openEdge() {
		
		System.setProperty("webdriver.edge.driver","D:\\chrome\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		return driver;
	}
}
