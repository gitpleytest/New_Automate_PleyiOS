package core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage_Links extends BaseClass {
public HomePage_Links(WebDriver driver){
		
		super(driver);
	}
	public boolean isElementPresent(By by) {
	    try {
	       
			driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	public void verifyPleyLogo()
	{
		System.out.println("verifyPleyLogo()");
		
		driver.findElement(By.xpath("//*[@id='header']/header/nav/div/div[1]/a")).click();
		boolean x = isElementPresent(By.xpath("//*[@id='header']/header/nav/div/div[1]/a"));
		Assert.assertTrue(x);
	}

	public void viewSets()
	{
		System.out.println("viewSets()");
		driver.findElement(By.xpath("//*[@id='top-menu']/li[2]/a")).click();	
		boolean x = isElementPresent(By.xpath("//*[@id='sets']/div/h1"));
		Assert.assertTrue(x);
	}

	public void howItWorks()
	{
		System.out.println("howItworks()");
		driver.findElement(By.xpath("//*[@id='top-menu']/li[3]/a")).click();	
		boolean x = isElementPresent(By.xpath("//*[@id='how-it-works']/div/div[1]/h1"));
		Assert.assertTrue(x);
	}

	public void gift()
	{
		System.out.println("gift()");
		driver.findElement(By.xpath("//*[@id='top-menu']/li[4]/a")).click();	
		boolean x = isElementPresent(By.xpath("//*[@id='gift-form']/div/h1"));
		Assert.assertTrue(x);
	}

	public void login()
	{
		System.out.println("login()");
		//driver.findElement(By.xpath("//*[@id='top-menu']/li[6]/button")).click();
		driver.findElement(By.xpath("//*[@id='top-menu']/li[6]/button")).click();	
		boolean x = isElementPresent(By.xpath("//*[@id='login']/div/div/div[2]/form/legend"));
		Assert.assertTrue(x);
		System.out.println("inside login()");
	}

	public void signup()
	{
		System.out.println("signup()");
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='hero']/div/div/div[1]/a")).click();	
		boolean x = isElementPresent(By.xpath("//*[@id='sign-up']/div/h1"));
		Assert.assertTrue(x);
	}
	
	public void footerLinks() throws InterruptedException
	{
		System.out.println("footerlinks()");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[2]/ul/li[2]/a")).click();	
		boolean viewsets = isElementPresent(By.xpath("//*[@id='sets']/div/h1"));
		Assert.assertTrue(viewsets);
		
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[2]/ul/li[1]/a")).click();	
		boolean hiw = isElementPresent(By.xpath("//*[@id='how-it-works']/div/div[1]/h1"));
		Assert.assertTrue(hiw);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[2]/ul/li[3]/a")).click();	
		String blog = driver.getTitle();
		Assert.assertEquals(blog, "Pley Blog | The New Way to Play");
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[3]/ul/li[1]/a")).click();	
		boolean about_us = isElementPresent(By.xpath("//*[@id='about']/div/div/div[2]/h1"));
		Assert.assertTrue(about_us);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[3]/ul/li[2]/a")).click();	
		Thread.sleep(1000);
		String trade_in = driver.getTitle();
		Assert.assertEquals(trade_in, "Pley - Trade In Your Bricks");
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[1]/div[3]/ul/li[3]/a")).click();	
		Thread.sleep(1000);
		String contact_us = driver.getTitle();
		Assert.assertEquals(contact_us, "Knowledge Base – Support and Knowledge Base for Pley");
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer']/footer/div/div[2]/p/a")).click();	
		Thread.sleep(1000);
		String terms = driver.getTitle();
		Assert.assertEquals(terms, "Pley - Pley - Terms and Conditions");
	}

}
