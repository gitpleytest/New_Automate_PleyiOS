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

public class TestGift_AnyAmount extends TestCore
{
	///----Check Gift FLow Case: Existing User To New User Random(No Login)----
	@Test(priority=0)
	public void TestgiftExistingToNewRandom() throws InterruptedException
	{
		GiftExistingToNew g = new GiftExistingToNew(driver);
		g.giftExistingUserToNewUser_Random();
		g.confirmgiftExistingUserToNewUser_Random();
	}
	 


	///----Check Gift FLow Case: Existing User To Existing User Random (No Login)----
		@Test(priority=1)
		public void TestgiftExistingToExistingRandom() throws InterruptedException
		{
			
			GiftExistingToExisting g = new GiftExistingToExisting(driver);
			g.giftExistingUserToExistingUser_Random();
			g.confirmgiftExistingUserToExistingUser_Random();
		}	
			
		//----Check Gift FLow Case: New User To New Random User (No Login)----
		@Test(priority=2)
		public void TestgiftNewToNewRandom() throws InterruptedException
		{
			GiftNewToNew g= new GiftNewToNew(driver);
		
		g.giftNewUserToNewUser_Random();
		g.confirmgiftNewUserToNewUser_Random();
		}

		//----Check Gift FLow Case: New User To Existing User Random(No Login)----
		@Test(priority=3)
		public void TestNewToExistingRandom() throws InterruptedException
		{
		
			GiftNewToExisting g = new GiftNewToExisting(driver);
			g.giftNewUserToExistingUser_Random();
			g.confirmgiftNewUserToExistingUser_Random();
			
		
		}
		//----Check Gift FLow Case: Existing User To New UserRandom(Logged In)----
		@Test(priority=4)
		public void TestExistingToNew_LoginRandom() throws InterruptedException
		{
			Login l =new Login(driver);
			GiftExistingToNew_Login gl = new GiftExistingToNew_Login(driver);
			Logout Lg = new Logout(driver);
			l.do_login();
		gl.giftExistingUserToNewUser_Login_Random();	
		gl.confirmgiftExistingUserToNewUser_Login_Random();
			Lg.do_logout();
		
			
		}

		
		//----Check Gift FLow Case: Existing User To Existing User Random (Logged In)
		@Test(priority=5)
		public void TestExistingToExisting_LoginRandom() throws InterruptedException
		{
			Login l =new Login(driver);
			Logout Lg = new Logout(driver);
			GiftExistingToExisting_Login gm = new GiftExistingToExisting_Login(driver);
			l.do_login();
			gm.giftExistingUserToExistingUser_Login_Random();
			gm.confirmgiftExistingUserToExistingUser_Login_Random();
			Lg.do_logout();
		
		}
		
}
