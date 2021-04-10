 package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumeay 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s=new Select(b.findElement(By.xpath("//select[@name='States']")));
		s.selectByIndex(0);
		s.selectByValue("New Jersey");
		s.selectByVisibleText("Texas");
		List<WebElement> l= s.getAllSelectedOptions();
		for(WebElement s1:l)
		{
			System.out.println(s1.getText());
		}
		List<WebElement> l1= s.getOptions();
		for(WebElement s2:l1)
		{
			System.out.println(s2.getText());
		}
		
				
		Thread.sleep(2000);
		s.deselectAll();
		b.close();
		
	}
	
		

}
