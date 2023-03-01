package Pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class LoginPage {
	 WebDriver driver;
	public void LoginPage() {
		
	}
	
  public void LoginMethod()  {
	   
	   String sysPath = System.getProperty("user.dir");
	   System.out.println("*******LoginMethod******sysPath = "+sysPath);
	   System.setProperty("webdriver.chrome.driver", sysPath + "/Drivers/chromedriver");  
	    
	    // Instantiate a ChromeDriver class.     
         driver=new ChromeDriver();  
    
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
     
      
         //Maximize the browser  
          driver.manage().window().maximize();  

          
          //Scroll down the webpage by 5000 pixelsimplicitlyWait  
       //   JavascriptExecutor js = (JavascriptExecutor)driver;  
      //  js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
     //   driver.findElement(By.linkText("Core Java")).click();     

	 
   }

  public void teardown() {
      // closes all the browser windows opened by web driver
	  driver.quit();     
      }
        
}
