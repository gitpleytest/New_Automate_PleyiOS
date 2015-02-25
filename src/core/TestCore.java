package core;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestCore {


	public static Properties object = new Properties();
	public static Properties config = new Properties();
	
	public static Properties test3 = new Properties();
	public static AppiumDriver driver=null;
		
		
		
		
			@BeforeSuite
			public void setup() throws  IOException, InterruptedException, MalformedURLException{
				
				Logger logger = Logger.getLogger("Log");
				PropertyConfigurator.configure("Log4j.properties");
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//config.properties");
				config.load(fis);
				fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//object.properties");
				object.load(fis);
				fis = new FileInputStream("test3.properties");
				test3.load(fis);
				
				if(driver==null){
					
					if (config.getProperty("Platform").toLowerCase().equals("android")){
						
						File classpathRoot = new File(System.getProperty("user.dir"));
						File app = new File(classpathRoot, "/app/com.android.chrome.apk");
						
						DesiredCapabilities capabilities = new DesiredCapabilities();
					//  DesiredCapabilities capabilities = DesiredCapabilities.android();
						capabilities.setCapability("browserName", "Chrome");
				    //  capabilities.setCapability("BROWSER_NAME", "Chrome");
					//	capabilities.setCapability("browserName", "");
						capabilities.setCapability("deviceName", "Android Simulator");
					//	capabilities.setCapability("device", "Android");
				        capabilities.setCapability("platformVersion", "4.4.2");
						
					//	capabilities.setCapability("platformVersion", "5.0.1");
				        capabilities.setCapability("platformName", "Android");
				        capabilities.setCapability("app", app.getAbsolutePath());
				        capabilities.setCapability("appPackage", "com.android.chrome");
				        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
				        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); 
				    //  driver = new AppiumDriver(new URL("http://127.0.0.1:9515/wd/hub"),capabilities);
				        
				        /*capabilities.setCapability("platformName", "Android");
				        capabilities.setCapability("deviceName","Android Emulator"); 
				        capabilities.setCapability("browserName", "Browser");
				        capabilities.setCapability("platformVersion", "5.0.1");  
				        capabilities.setCapability("Android", true);
				        driver= new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				     	*/
						
					}
					else
					{
					    DesiredCapabilities capabilities = new DesiredCapabilities();
				        capabilities.setCapability("deviceName", "iPhone 4s");
				        capabilities.setCapability("platformName", "iOS");
				        capabilities.setCapability("platformVersion", "8.1");
				        capabilities.setCapability("browserName", "safari");
				        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
				       
					}
					
					driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
					
					
					driver.get("https://dev2.pley.com/");
					
					
					System.out.println("Title of the page is : "+driver.getTitle());
					
				
			}
			
		}
			
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		
	}
}




