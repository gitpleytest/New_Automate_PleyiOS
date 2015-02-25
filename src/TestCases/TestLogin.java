package TestCases;



import org.testng.annotations.Test;

import core.Login;
import core.Logout;
import core.TestCore;

public class TestLogin extends TestCore {
	
	@Test
	public void Login() throws InterruptedException{
		
		
		Login lg = new Login(driver); 
		
		//Do Login
		lg.do_login();
		Thread.sleep(3000);
		
		
		//Verify Login
		
		
		
		//Do Logout
		Logout logout = new Logout(driver);
		logout.do_logout();
		
	}

}
