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
@Test
public void f1() {

	  System.out.println("Function 1 Executing");

 }

@Test
public void f2() {

	  System.out.println("Function 2 Executing");

 }

@Test
public void f3() {

	  System.out.println("Function 3 Executing");

 }
@Test
public void f4() {

	  System.out.println("Function dfdf**4 Executing");

 }
}
