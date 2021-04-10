package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_copy_paste 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		Actions action1=new Actions(b);
		WebElement copy1=b.findElement(By.xpath("//span[contains(text(),'Java')]//parent::h2"));
		Thread.sleep(2000);
		action1.doubleClick(copy1).perform();
		action1.keyDown(copy1, Keys.CONTROL).sendKeys("c").perform();
		WebElement copy2=b.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(2000);
		copy2.clear();
		action1.keyDown(copy2, Keys.CONTROL).sendKeys("v").perform();
	   
		
		
}
}
