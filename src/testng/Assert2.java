package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assert2 
{
   public static void main(String[] args)
   {
	   
	    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://demo.actitime.com/login.do");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		b.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    b.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login ')]")).click();
	    WebElement task= b.findElement(By.xpath("//div[@id='addTaskButtonId']"));
	    WebDriverWait w=new WebDriverWait(b,10);
		w.until(ExpectedConditions.elementToBeClickable(task));
		task.click();
		  
		  
	
		 
    }
}
