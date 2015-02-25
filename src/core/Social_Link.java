package core;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Social_Link extends BaseClass {
       public Social_Link(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
       
       public void Facebook_link() throws InterruptedException
       { 
    	   driver.get("https://stage.pley.com/");
    		Thread.sleep(1000);
    	   driver.findElement(By.xpath(TestCore.object.getProperty("fb"))).click();
    	   Thread.sleep(2000);
    	   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    	   driver.switchTo().window(tabs2.get(1));
    	   String s = driver.getCurrentUrl();
      	   Assert.assertEquals(s, "https://www.facebook.com/pleygo");
    	   driver.close();
    	   driver.switchTo().window(tabs2.get(0));
    	   Thread.sleep(2000);    	  
       }
       
       public void Tweeter_link() throws InterruptedException
       {
    	   
    	   driver.findElement(By.xpath(TestCore.object.getProperty("twr"))).click();
    	   Thread.sleep(2000);
    	   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
   	       driver.switchTo().window(tabs2.get(1));
  	       String s = driver.getCurrentUrl();
	       Assert.assertEquals(s, "https://twitter.com/MyPley");
   	       driver.close();
   	       driver.switchTo().window(tabs2.get(0));
   	       Thread.sleep(2000);  
       }
       
       public void Pinterest_link() throws InterruptedException
       {
    	   
    	   driver.findElement(By.xpath(TestCore.object.getProperty("pt"))).click();
    	   Thread.sleep(2000);
    	   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
   	       driver.switchTo().window(tabs2.get(1));
 	       String s = driver.getCurrentUrl();
 	       Assert.assertEquals(s, "http://www.pinterest.com/pleygo/");
   	       driver.close();
   	       driver.switchTo().window(tabs2.get(0));
   	       Thread.sleep(2000);
       }
       
       public void YouTube_link() throws InterruptedException
       {
    	  driver.findElement(By.xpath(TestCore.object.getProperty("ye"))).click();
    	  Thread.sleep(2000);
    	  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
  	      driver.switchTo().window(tabs2.get(1));
  	      String s = driver.getCurrentUrl();
   	      Assert.assertEquals(s, "https://www.youtube.com/channel/UCojrLNLU9UrfxtJnI8XlrBA");
  	      driver.close();
  	      driver.switchTo().window(tabs2.get(0));
          Thread.sleep(2000);  	     
       }
}
