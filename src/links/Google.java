package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com");
		WebElement f=b.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(2000);
		f.sendKeys("jav");
		Thread.sleep(2000);
		f.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		f.sendKeys(Keys.ENTER);
		List<WebElement> links1=b.findElements(By.tagName("a"));
		System.out.println(links1.size());
		for(WebElement link:links1)
		{
			System.out.println(link.getAttribute("href"));
			System.out.println(link.getAttribute("innerHTML"));
			//System.out.println(link.getText());
			
		}
}
}
