package adactin_pro.base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Base {
	
	
	 public static WebDriver nv;
	   
	public static void Launching(String dr) {
		
		if(dr.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "C:\\NITHISH\\chromedriver_win32\\chromedriver.exe");
		    nv = new ChromeDriver();
		}
		else if (dr.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\NITHISH\\edgedriver_win64\\msedgedriver.exe");
			nv= new EdgeDriver();
		}
		
	}
	
	public static void Opening(String url) {
		nv.get(url);
	}
	public static void Sending(WebElement s1, String s2) {
		s1.sendKeys(s2);
	}
	
	public static void Clicking(WebElement c1) {
		c1.click();
	}
	
	public static void Clearing(WebElement clr) {
		clr.clear();
	}

	public static void Closing() {
		nv.close();
	}
	
    public static void Quitting() {
    	nv.quit();
    }
    
    public static void Waiting() {
    	nv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public static void Selecting(WebElement xx, String txt) {
    	Clicking(xx);
    	Select sl= new Select(xx);
    	sl.selectByVisibleText(txt);
    	String att= xx.getAttribute("value");
    }
    
    public static boolean IsDis(WebElement id) {
    	boolean disp = false;
    	try {
    		disp = id.isDisplayed();
		} catch (Exception e) {
			System.out.println("page not logined : " + e.getMessage());
		}
    	
    	return disp;
    	
    }
    
//    public static void Verifying(WebElement xx, String yy) {
//    	if(xx.getAttribute("value").equals(yy)) {
//  	  		   System.out.println("hotel name verified as we searched"); 
//  	  	   }
//  	  	   else {
//  	  		   System.out.println("not verifiede");
//  	       }	
//    		
    		
   
    }
    
    
      
  
    
 


