package actionclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru99 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://demo.guru99.com/test/simple_context_menu.html");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement right=b.findElement(By.xpath("//span[contains(@class,'context-menu-one btn btn-neutral')]"));
		Actions a=new Actions(b);
		a.contextClick(right).perform();
		WebElement edit1=b.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[1]"));
		WebElement edit2=b.findElement(By.xpath("//*[text()='Edit']"));
		if(edit2.isDisplayed())
		{
			edit1.click();
			Alert s=b.switchTo().alert();
			s.accept();
			Thread.sleep(3000);
			
		}
		WebElement double1=b.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a1=new Actions(b);
		a1.doubleClick(double1).perform();
		
		
}
}
