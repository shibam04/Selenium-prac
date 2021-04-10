package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://jqueryui.com/droppable/");
		 Thread.sleep(2000);
		 WebElement frame1=b.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 b.switchTo().frame(frame1);
		 WebElement drag=b.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop=b.findElement(By.xpath("//div[@id='droppable']"));
		 Actions x=new Actions(b);
		 Thread.sleep(2000);
		// x.dragAndDrop(drag, drop).perform();
		 x.clickAndHold(drag).moveToElement(drop).release().perform();
		 WebElement s=b.findElement(By.xpath("//*[text()='Dropped!']"));
		 if(s.isDisplayed())
		 {
			 System.out.println("Successful");
		 }
		 
}
}
