package radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.facebook.com/");
		Thread.sleep(2000);
		b.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
			WebElement d=b.findElement(By.xpath("//input[@name='firstname']"));
			d.sendKeys("Shibam");
			List<WebElement> a=b.findElements(By.xpath("//input[@type='radio']"));
			for(WebElement w:a)
			{
				String z=w.getAttribute("value");
				System.out.println(z);
				if(z.equalsIgnoreCase("2"))
				{
					w.click();
				}
			}
			
}
}
