package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import core.Logout;
import core.SignUp;
import core.TestCore;

public class TestSignup extends TestCore
{
	@Test
	public void Testsignup1() throws InterruptedException, IOException
	{
		SignUp s= new SignUp(driver);
		Logout l = new Logout(driver);
		s.open_signup_page();
		s.signup();
		s.verify_signup();
		l.do_logout();
		
	}

}
