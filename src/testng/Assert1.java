package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 
{
	@Test
   public void test()
  {
	  SoftAssert soft=new SoftAssert();
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiA7YyCBhD_ARIsALkj54pQnPWlHy5NuNlR8kx_vrfhXcDayQLGB5T0uVHLN82GEBQXDASwOjEaAtLVEALw_wcB");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title=b.getTitle();
		System.out.println(title);
		String exp="fsmzhxjs";
		Assert.assertEquals("Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2021 | BlueStone.com", exp);
		//String act="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2021 | BlueStone.com";
		//soft.assertEquals("Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2021 | BlueStone.com", exp);
		//soft.assertAll();
		
  }
}
