package TestCases;

import org.testng.annotations.Test;

import core.GiftExistingToExisting;
import core.GiftExistingToExisting_Login;
import core.GiftExistingToNew;
import core.GiftExistingToNew_Login;
import core.GiftNewToExisting;
import core.GiftNewToNew;
import core.Login;
import core.Logout;
import core.TestCore;

public class TestGift_25<driver> extends TestCore
{
	//----Check Gift FLow Case: Existing User To New User (No Login)----
	@Test(priority=0)
	public void TestgiftExistingToNew() throws InterruptedException
	{
		GiftExistingToNew g = new GiftExistingToNew(driver);
		
		g.giftExistingUserToNewUser_25();
		g.confirmgiftExistingUserToNewUser_25();
		
	}
	
	
	//----Check Gift FLow Case: Existing User To Existing User (No Login)----
	@Test(priority=1)
	public void TestgiftExistingToExisting() throws InterruptedException
	{
		
		GiftExistingToExisting g = new GiftExistingToExisting(driver);
		g.giftExistingUserToExistingUser_25();
		g.confirmgiftExistingUserToExistingUser_25();
		
	}
	
	
	
	
	//----Check Gift FLow Case: New User To New User (No Login)----
	@Test(priority=2)
	public void TestgiftNewToNew() throws InterruptedException
	{
		GiftNewToNew g= new GiftNewToNew(driver);
		g.giftNewUserToNewUser_25();
		g.confirmgiftNewUserToNewUser_25();
	
	}

	
	//----Check Gift FLow Case: New User To Existing User (No Login)----
	@Test(priority=3)
	public void TestNewToExisting() throws InterruptedException
	{
	
		GiftNewToExisting g = new GiftNewToExisting(driver);
		
		g.giftNewUserToExistingUser_25();
		g.confirmgiftNewUserToExistingUser_25();
	
	}

	
	//----Check Gift FLow Case: Existing User To New User (Logged In)----
	@Test(priority=4)
	public void TestExistingToNew_Login() throws InterruptedException
	{
		Login l =new Login(driver);
		GiftExistingToNew_Login gl = new GiftExistingToNew_Login(driver);
		Logout Lg = new Logout(driver);
		l.do_login();
		gl.giftExistingUserToNewUser_Login_25();
		gl.confirmgiftExistingUserToNewUser_Login_25();
		Lg.do_logout();

	}
	
	
	//----Check Gift FLow Case: Existing User To Existing User (Logged In)
	@Test(priority=5)
	public void TestExistingToExisting_Login() throws InterruptedException
	{
		Login l =new Login(driver);
		Logout Lg = new Logout(driver);
		GiftExistingToExisting_Login gm = new GiftExistingToExisting_Login(driver);
		l.do_login();
		gm.giftExistingUserToExistingUser_Login_25();
		gm.confirmgiftExistingUserToExistingUser_Login_25();
		Lg.do_logout();
	
	}
}


