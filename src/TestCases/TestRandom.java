package TestCases;

import org.testng.annotations.BeforeTest;
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

public class TestRandom extends TestCore{
	
	

		
	/*@Test(priority=4)
	public void TestExistingToNew_Login() throws InterruptedException
	{
		Login l =new Login(driver);
		GiftExistingToNew_Login gl = new GiftExistingToNew_Login(driver);
		Logout Lg = new Logout(driver);
		l.do_login();
		gl.giftExistingUserToNewUser_Login_50();
		gl.confirmgiftExistingUserToNewUser_Login_50();
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
				gm.giftExistingUserToExistingUser_Login_50();
				gm.confirmgiftExistingUserToExistingUser_Login_50();
				Lg.do_logout();
			}

*/
			@Test(priority=0)
			public void TestgiftExistingToNewRandom() throws InterruptedException
			{
				GiftExistingToNew g = new GiftExistingToNew(driver);
				g.giftExistingUserToNewUser_Random();
				g.confirmgiftExistingUserToNewUser_Random();
			}
			
	    /*     @Test(priority=1)
			public void TestgiftExistingToExistingRandom() throws InterruptedException
			{
				
				GiftExistingToExisting g = new GiftExistingToExisting(driver);
				g.giftExistingUserToExistingUser_Random();
				g.confirmgiftExistingUserToExistingUser_Random();
			}	
		*/	 
}
