package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pomClassesFB.HomePageHeaders;
import pomClassesFB.LoginPage;
import pomClassesFB.SignOutAmazon;

public class VerifyHeadersAmazon {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//test1                                              // import loginpage. keep constructor ref name same as pomclass name just change with small letter
		LoginPage loginpage= new LoginPage(driver);  //this driver will pass in loginpage's driver in initElements method argumensts
		
		Thread.sleep(2000);
		loginpage.signin1Click();
		loginpage.sendEmailId();
		loginpage.clickonContinue();
		loginpage.sendPassword();
		loginpage.clickonSigin();
		
		
		HomePageHeaders homepageHeaders= new HomePageHeaders(driver);// make constructor ref for each pomclass as per requirement
		homepageHeaders.clickOnApay();
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		
		if((url.equals("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay") && title.equals("Amazon Pay")))
				{
			System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
		
//		SignOutAmazon signoutamazon= new SignOutAmazon();
//		signoutamazon.clickonSignOutMove(driver);
		homepageHeaders.clickonSignOutMove(driver);
		
		//test2
		driver.get("https://www.amazon.in/");
		                                             // import loginpage. keep constructor ref name same as pomclass name just change with small letter
		loginpage= new LoginPage(driver);  //this driver will pass in loginpage's driver in initElements method argumensts
		
		Thread.sleep(2000);
		loginpage.signin1Click();
		loginpage.sendEmailId();
		loginpage.clickonContinue();
		loginpage.sendPassword();
		loginpage.clickonSigin();
		homepageHeaders.clickOnGcards();
		String urlGC = driver.getCurrentUrl();
		String titleGC= driver.getTitle();
		System.out.println(urlGC);
		System.out.println(titleGC);
		if((urlGC.equals("https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc") && titleGC.equals("Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in")))
				{
			System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
		homepageHeaders.clickOnReturnsOrders();
		String urlRO = driver.getCurrentUrl();
		String titleRO= driver.getTitle();
		System.out.println(urlRO);
		System.out.println(titleRO);
		if((urlRO.equals("https://www.amazon.in/gp/css/order-history?ref_=nav_orders_first") && titleRO.equals("Your Orders")))
				{
			System.out.println("Pass");
				}
		
		else
		{
			System.out.println("Fail");	
	    }
		
		//test3
		//Select lang= new Select(null);
		homepageHeaders.checkLanguage(driver);

}
	}
