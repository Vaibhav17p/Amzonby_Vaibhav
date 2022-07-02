package pomClassesFB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageHeaders {
	
	
	@FindBy (xpath="//i[@class='hm-icon nav-sprite']")
	        WebElement all;
	
	@FindBy (xpath="//a[text()='Your Account'])[2]")
    WebElement yacc;
	
	@FindBy (xpath="//a[text()='Amazon Pay']")
    WebElement apay;
	
	@FindBy (xpath="//a[text()='Gift Cards']")
    WebElement gcards;
	
	@FindBy (xpath="//a[@id=\"nav-orders\"]")
    WebElement reor;
	
	@FindBy (xpath="//a[text()='Sign Out']")
    WebElement signout;
	
	@FindBy (xpath="//span[text()='Account & Lists']")
    WebElement accorderlo;
	
	@FindBy (xpath="//a[@id='icp-touch-link-language']")
	WebElement lang;
	
	@FindBy (xpath="//span[text()='HI']")
	WebElement selectedLangHi;
	
	@FindBy (xpath="//a[@aria-label='Open Menu']")
	WebElement menu;
	
	
	
	
	
	
		 //this.driver=driver;
	
	
	//WebDriver driver;
	 public HomePageHeaders(WebDriver driver)// to pass browser from testclass to pomclass
	  {
		  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
	  }
	 
	
	public void clickOnApay()
	{
		apay.click();
	}
	public void clickOnGcards()
	{
		gcards.click();
	}
	public void clickOnReturnsOrders()
	{
		reor.click();
	}
	public void clickonYourAcc()
	{
		yacc.click();
	}
	public void clickonSignOut()
	{
		yacc.click();
	}
	public void clickonSignOutMove(WebDriver driver) throws InterruptedException
	{
//		Actions act= new Actions(driver);
//		act.moveToElement(accorderlo).perform();
		Thread.sleep(2000);
//	signout.click();
	
		menu.click();
		Thread.sleep(4000);
		signout.click();
	}
	public void checkLanguage(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", lang);
		lang.click();
		boolean result=selectedLangHi.isSelected();
		if(result==true)
		{System.out.println("Selected language Hindi");}
		else
		{System.out.println("Not slected hindi");
		Thread.sleep(4000);
		selectedLangHi.click();
		}
	}
		
		
	}
		
	
	
	
	


