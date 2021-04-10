package explicitWAit1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Senddata12 
{
	@Test(dataProvider="data",dataProviderClass=excel1.ReadExcel1.class)
	public void tc1(String user,String pass) throws InterruptedException
	{
		System.out.println("User:"+user);
		System.out.println("password:"+pass);
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");	
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		b.get("https://demo.actitime.com/login.do");
		WebElement login=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		WebElement password=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		WebDriverWait wait=new WebDriverWait(b,10);
		
		if(wait.until(ExpectedConditions.visibilityOf(login)) != null)
		{
			login.sendKeys(user);
		}
		if(wait.until(ExpectedConditions.visibilityOf(password)) != null)
		{
			password.sendKeys(pass,Keys.ENTER);
		}
		
		

	}
}

