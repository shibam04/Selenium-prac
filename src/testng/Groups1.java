package testng;

import org.testng.annotations.Test;

public class Groups1 
{
	@Test(groups="Functional")
  public void test1()
  {
	  System.out.println("Testcase1");
  }
	@Test(groups="Regression")
  public void test2()
  {
	  System.out.println("Testcase2");
  }
	@Test(groups= {"Regression","bvt"})
  public void test3()
  {
	  System.out.println("Testcase3");
  }
}
