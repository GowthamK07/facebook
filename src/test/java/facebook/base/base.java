package facebook.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static Actions a ;
	public static WebDriver driver ;
	
	public static WebDriverWait w ;
	public static Select s; 
	
	public static Alert al ;
	
	
	
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		w = new WebDriverWait(driver, 20);
		
	 
         
	}
	
	
	public void inputText (WebElement e,String value) {
		e.sendKeys(value);
		
		
		
	}
	
	public void max () {
		driver.manage().window().maximize();
		
	}
	
	public void button (WebElement e ) {
		e.click();
	
		
	}
	public void  inputText(String value ,WebElement e) {
		 a = new Actions(driver);
		 a.sendKeys(e).build().perform();
		 
	}
		
	
	public void buttona (WebElement e ){
		
		a.click().build().perform();
		
	}
	public void clickdouble (WebElement e){
		
		a.doubleClick().build().perform();
		
	}
	public void rightclick (WebElement e){
		
		a.contextClick().build().perform();
		
		
	}
	public void movecurser (WebElement e){
		
		a.moveToElement(e).build().perform();
		
	}
	
	public void choosebytext (WebElement e,String value) {
		
		 s = new Select(e);
		s.selectByVisibleText(value);
		
		
	}
	public void choosebyvalue (String value,WebElement e ){
		
		 s = new Select(e);
		s.selectByVisibleText(value);
		
		
	}
	public void choosebyindex (WebElement e,int value) {
		
		
		s.selectByIndex(value);
	}
		
		public void unselectbytext (WebElement e,String value) {
			
			 s = new Select(e);
			s.selectByVisibleText(value);
			
			
		}
		public void unselectbyvalue (String value,WebElement e ){
			
			 s = new Select(e);
			s.selectByVisibleText(value);
			
			
		}
		public void unselectbytext (WebElement e,int value) {
			
			
			s.selectByIndex(value);		
		
		
	}
	
    public void showtext (WebElement e) {
		
		e.getText();
		
    }
    public void  changeto(WebElement e) {
    	
    	driver.switchTo();
		
		
		
     }
    
    public void changetoalert () {
    	
    	driver.switchTo().alert();
		
	
    }
    
    public void okalert (WebElement e) {
    	
    	al.accept();
		
	
    }
    
    public void cancelalert ( ) {
    	
    	al.dismiss();
		
	
    }
    
    public void promtalert (String value) {
    	
    	al.sendKeys(value);
    	al.accept();
		
	
    }
    public void toframeindex ( int i) {
    	driver.switchTo().frame(i);
		
		
		
    }
    public void toframestring( String frme) {
    	driver.switchTo().frame(frme);
			
		
    }
    public void toparentframe () {
    	driver.switchTo().parentFrame();
			
		
    }
    
    public void  toframeweb(WebElement e) {
		
		driver.switchTo().frame(e);
		
		
    }

		
		
    
    public void  closebrowser () {
		
		driver.quit();
		
    }
    
   public void closetab( ) {
		
		driver.close();
		
    }
  
}
