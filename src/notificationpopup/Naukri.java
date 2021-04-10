package notificationpopup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver b=new ChromeDriver();
		b.get("https://www.naukri.com/");
		b.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		b.manage().window().maximize();
		Thread.sleep(10000);
		b.findElement(By.xpath("//span[@id='block']")).click();
		
}
}
