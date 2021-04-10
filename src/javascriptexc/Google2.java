package javascriptexc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		WebElement search=b.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor js=(JavascriptExecutor) b;
		js.executeScript("arguments[0].setAttribute('style','border:4px solid red; background:green');",search);
}
}
