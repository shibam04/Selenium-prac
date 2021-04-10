package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://www.spicejet.com/");
		 List<WebElement> menus= b.findElements(By.xpath("//li[@class='hide-mobile']"));
		 System.out.println(menus.size());
		 Actions a=new Actions(b);
		 for(int i=0;i<menus.size()-3;i++)
		 {
			 a.moveToElement(menus.get(i)).perform();
		 }
		
}
}
