package core;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{
	
	String header_name = driver.findElement(By.xpath(TestCore.object.getProperty("header"))).getText();
	String login = driver.findElement(By.xpath(TestCore.object.getProperty("login"))).getText();
	String signup = driver.findElement(By.xpath(TestCore.object.getProperty("signup"))).getText();
	
	

	public HomePage(WebDriver driver){
		
		super(driver);
	}

	public void headername(){
		Assert.assertEquals(header_name, "Pley");
	}
	public void login(){
		Assert.assertEquals(login, "Login");
	}
	public void signup(){
		Assert.assertEquals(signup, "Start My Free Trial");
		
	}
	
	}

