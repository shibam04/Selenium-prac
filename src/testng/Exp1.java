package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exp1 
{
	@BeforeTest
	public void login()
	{
		System.out.println("Login");
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("Logout");
	}
	@BeforeClass()
	public void Class()
	{
		System.out.println("class");
	}
	@AfterClass()
	public void Class1()
	{
		System.out.println("class1");
	}
	@BeforeMethod
	public void Shibam()
	{
		System.out.println("*********");
	}
	@AfterMethod
	public void seal()
	{
		System.out.println("&&&&&&&&&&");
	}
	 
	@Test(priority=2,description="Prac1")
   public void hello()
   {
	 System.out.println("hi");  
   }
	@Test(priority=1)
   
	public void welcome()
	{
		System.out.println("Welcome");
	}
}
