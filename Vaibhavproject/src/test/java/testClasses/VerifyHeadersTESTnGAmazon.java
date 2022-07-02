package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomClassesFB.HomePageHeaders;
import pomClassesFB.LoginPage;
import pomClassesFB.SignOutAmazon;

public class VerifyHeadersTESTnGAmazon {
		WebDriver driver;        //declare all ref global which are multiple use.
		LoginPage loginpage;
		HomePageHeaders homepageHeader;
		SignOutAmazon signoutamazon;
		@Parameters("BroW")
		@BeforeTest
		public void browserLaunch(String browser)
		{
			if(browser.equals("Chrome"))
			{
				driver=Base.openChrome();
			}
			if(browser.equals("Firefox"))
			{
				driver=Base.openFireFox();
			}
			if(browser.equals("Edge"))
			{
				driver=Base.openEdge();
			}
			
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		@BeforeClass
		public void objectsOfPoM()
		{
			LoginPage loginpage=new LoginPage(driver);
			HomePageHeaders homepageHeader=new HomePageHeaders(driver);
			SignOutAmazon signoutamazon= new SignOutAmazon();
		    
		}
		@BeforeMethod
		public void apploginmethod() throws InterruptedException
		{	driver.get("https://www.amazon.in/");
		
			  //this driver will pass in loginpage's driver in initElements method argumenst
		   
			Thread.sleep(2000);
		    loginpage=new LoginPage(driver);
			loginpage.signin1Click();
			loginpage.sendEmailId();
			loginpage.clickonContinue();
			loginpage.sendPassword();
			loginpage.clickonSigin();
		}
		@Test 
		public void testcase1_Pay()
		{
		   // homepageHeader= new HomePageHeaders(driver);// make constructor ref for each pomclass as per requirement
			homepageHeader.clickOnApay();
			String url = driver.getCurrentUrl();
			String title= driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			if((url.equals("https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay") && title.equals("Amazon Pay")))
					{
				System.out.println("Pass");
					}
			else
			{
				System.out.println("Fail");
			}
			
		}

		@Test
		public void testcase2_Gift()
		{   //constructor object ref of class should be created
		   // homepageHeader= new HomePageHeaders(driver);
			homepageHeader.clickOnGcards();
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
		}
		
		@Test
		public void test3_LangCheck() throws InterruptedException
		{//when driver is used already in pom class then it should also declared in argument of calling method by ref of class object
		  //  homepageHeader= new HomePageHeaders(driver);
			homepageHeader.checkLanguage(driver);
		}
		
		
		@AfterMethod
		public void loGOut() throws InterruptedException
		{
		    homepageHeader= new HomePageHeaders(driver);// class object ref of that class is compulsary for every method to call
			homepageHeader.clickonSignOutMove(driver);
		}
		@AfterClass
		public void clearObjects()
		{
			homepageHeader=null;
			loginpage=null;
			signoutamazon=null;
			
		}
		@AfterTest
		public void browerClose(){
			driver.close();
			driver= null;
			System.gc(); // garbage remove object ref
		}
	}

