package tests;
import Pages.LoginPage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestTest extends LoginPage {
	
	@BeforeClass
	 public void Setup() {
		//LoginMethod();  
		//assertTrue("true");
	  }
  
@Test
  public void f() {
	LoginMethod();  
//	assertTrue("true");
	  System.out.println("Function Executing");
  }
}
