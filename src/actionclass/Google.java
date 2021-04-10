package actionclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(5000);
		
		List<WebElement> sugestions=b.findElements(By.xpath("//div[@class='sbl1']"));
		System.out.println(sugestions.size());
		Actions u=new Actions(b);
	
		for(WebElement x:sugestions)
		{
			u.moveToElement(x).perform();
			
			Thread.sleep(2000);
			String s=x.getText();
			if(s.equalsIgnoreCase("javascript"))
			{
				u.moveToElement(x).click().perform();
				break;
			}
		}
		b.close();

	}
}
