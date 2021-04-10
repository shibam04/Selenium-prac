package frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();		
		b.get("http://demo.guru99.com/test/autoit.html");
		b.findElement(By.xpath("//span[@id='postjob']")).click();
		Thread.sleep(5000);
		b.switchTo().frame(b.findElement(By.id("JotFormIFrame-72320244964454")));
		WebElement x=b.findElement(By.xpath("//input[@id='input_3' and @size='25']"));
		x.sendKeys("Shibam");
}
}
