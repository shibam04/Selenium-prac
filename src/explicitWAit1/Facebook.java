package explicitWAit1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.facebook.com/");
		WebElement x=b.findElement(By.xpath("//input[@type='text']"));
		WebElement login=b.findElement(By.xpath("//button[@value='1']"));
		WebDriverWait w=new WebDriverWait(b,10);
		w.until(ExpectedConditions.visibilityOf(x));
		x.sendKeys("Shibam");
		w.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
}
}
