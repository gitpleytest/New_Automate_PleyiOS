package core;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout extends BaseClass
{

	public Logout(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void do_logout() throws InterruptedException
	{
		Logger logger = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		WebElement de1 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("menu"))));
		//driver.findElement(By.xpath("//*[@id='top']/div/div/div[1]/div/button/snap")).click();
		//Thread.sleep(3000);
		de1.click();
		Thread.sleep(3000);
		logger.info("Click on Menu tab");
		
		logger.info("Logging out...");
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("logout"))));
		//driver.findElement(By.xpath(TestCore.object.getProperty("logout"))).click();
		Thread.sleep(4000);
		de2.click();
		logger.info("Logged Out Successfully!");
	}

}
