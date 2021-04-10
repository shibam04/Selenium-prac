package notificationpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus 
{
	public static void main(String[] args) 
	  {
		  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  ChromeOptions co=new   ChromeOptions();
		  co.addArguments("--disable-notifications");
			 WebDriver b=new ChromeDriver(co);
			 b.get("https://www.redbus.in/");
	}
}
