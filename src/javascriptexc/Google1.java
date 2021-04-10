package javascriptexc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) b;
		WebElement search=b.findElement(By.xpath("//input[@name='q']"));
		js.executeScript("arguments[0].value='selenium'", search);
		WebElement enter=b.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/descendant::input[1]"));
		js.executeScript("arguments[0].click()", enter);
		
}
}
