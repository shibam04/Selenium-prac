package javascriptexc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) b;
		//js.executeScript("alert('WELCOME SHIBAM')");
		js.executeScript("prompt('Enter details')");
}
}
