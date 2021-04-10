package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip 
{
	@Test(enabled=false)
  public void Login()
  {
	  System.out.println("Enter name:");
	  
  }
	@Test
  public void details()
  {
	  System.out.println("hi");
	  throw new SkipException("skip test");
  }
	@Test
  public void logout()
  {
	  System.out.println("logout");
  }
}
