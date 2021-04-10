package fluent1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Google 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver b=new ChromeDriver();
	b.manage().window().maximize();
	b.get("https://www.google.com");
	b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement search=b.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	Wait<WebDriver> w=new FluentWait<WebDriver>(b).
	withTimeout(Duration.ofSeconds(10)).
	pollingEvery(Duration.ofSeconds(3)).withMessage("Shibam").
	ignoring(Exception.class);
	w.until(ExpectedConditions.visibilityOf(search)).sendKeys("Iron man movie",Keys.ENTER);
	
	
}
}
