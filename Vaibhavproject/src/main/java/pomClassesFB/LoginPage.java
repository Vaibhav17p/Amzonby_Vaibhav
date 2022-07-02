package pomClassesFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement signin1 ;
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement emailiD ;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continu ;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password ;

	
	@FindBy (xpath=	"//input[@id='signInSubmit']")
	private WebElement signin ;

  public LoginPage(WebDriver driver)// to pass browser from testclass to pomclass
  {
	  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
  }
 
  
  public void signin1Click() {
	  signin1.click();
  }
  
  public void sendEmailId() {
	  emailiD.sendKeys("vaibhavparhad@gmail.com");
  }

  public void sendPassword() {
	  password.sendKeys("9503293096");
  }
  
  public void clickonSigin() {
	  signin.click();
  }
  public void clickonContinue() throws InterruptedException {
	  Thread.sleep(5000);
	  continu.click();
  }
  
  
  
  
}