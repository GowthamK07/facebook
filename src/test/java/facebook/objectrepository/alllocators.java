package facebook.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import facebook.base.base;

public class alllocators extends base{
	
	public WebElement getDay() {
		return day;
	}




	public WebElement getMonth() {
		return month;
	}




	public WebElement getYear() {
		return year;
	}




	public WebElement getMale() {
		return male;
	}




	public WebElement getForgotsearch() {
		return forgotsearch;
	}




	public WebElement getForgotemail() {
		return forgotemail;
	}




	public WebElement getForgot() {
		return forgot;
	}




	public alllocators (){
		PageFactory.initElements(driver, this);
			
	}
	

	

	public WebElement getLogbutton() {
		return logbutton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getReenter() {
		return reenter;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignbutton() {
		return signbutton;
	}

	public WebElement getLogmail() {
		return logmail;
	}

	public WebElement getLogpass() {
		return logpass;
	}

	

	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement newaccount ;
	
	public WebElement getNewaccount() {
		return newaccount;
	}
	
	
	@FindBy (xpath = "//input[@name='firstname']")
	
	private WebElement fname ;
	
	
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement email ;
	
	
	@FindBy (xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement reenter ;
	
	@FindBy (xpath ="//input[@name='reg_passwd__']")
	private WebElement password;
	
	
	@FindBy (xpath = "//button[@name='websubmit']")
	private WebElement signbutton ;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement  logmail;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement logpass ;
	
	@FindBy (xpath ="//button[@name='login']")
	private WebElement logbutton ;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lname ;
	
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgot ;
	
	@FindBy(xpath = "//input[@id='identify_email']")
	private WebElement forgotemail ;
	
	
	@FindBy(xpath = "//button[@name='did_submit']")
	private WebElement forgotsearch ;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day ;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month ;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year ;
	
	
	@FindBy(xpath = "//input[@value='2']")
	private WebElement male ;
	
	
	
	
	
	
	
	
}
