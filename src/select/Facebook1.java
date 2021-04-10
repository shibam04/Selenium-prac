package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		WebElement day=b.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByVisibleText("4");
		WebElement month=b.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("10");
		WebElement year=b.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1994");
		List<WebElement> x=s2.getOptions();
		int s5=x.size();
		System.out.println(s5);
		for(WebElement year1:x)
		{
			System.out.println(year1.getText());
		
		}
		
}
}
