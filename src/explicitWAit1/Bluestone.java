package explicitWAit1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiA7YyCBhD_ARIsALkj54pQnPWlHy5NuNlR8kx_vrfhXcDayQLGB5T0uVHLN82GEBQXDASwOjEaAtLVEALw_wcB");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ring=b.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		Actions a=new Actions(b);
		a.moveToElement(ring).perform();
		WebElement diamond=b.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']"));
		WebDriverWait w=new WebDriverWait(b,10);
		if(w.until(ExpectedConditions.attributeContains(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']"), "title", "Diamond Rings"))!=null)
		{
			a.moveToElement(diamond).click().perform();
		}		

		//w.until(ExpectedConditions.elementToBeClickable(diamond)).click();
		/*if(w.until(ExpectedConditions.attributeToBe(diamond, "title", "Diamond Rings"))!=null)
		{
			a.moveToElement(diamond).click().perform();
		}*/
		//w.until(ExpectedConditions.visibilityOf(diamond)).click();
		
	
}
  }
