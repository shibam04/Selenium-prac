package alertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://mail.rediff.com/cgi-bin/login.cgi");
		b.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Alert x=b.switchTo().alert();
		System.out.println(x.getText());
		x.accept();
	
		
		
}
}
