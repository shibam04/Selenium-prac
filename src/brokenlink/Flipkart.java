package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
  public static void main(String[] args) throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.flipkart.com/");
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> link=b.findElements(By.tagName("a"));
		System.out.println("Total links:"+link.size());
		List<WebElement> image=b.findElements(By.tagName("img"));
		System.out.println("Total image links:"+image.size());
		link.addAll(image);
		System.out.println("After adding image and link:"+link.size());
		List<WebElement> activelink=new ArrayList<WebElement>();
		for(int i=0;i<link.size();i++)
		{
			if(link.get(i).getAttribute("href")!=null && (!link.get(i).getAttribute("href").contains("tel")))
			{
				activelink.add(link.get(i));
				String url=link.get(i).getAttribute("href");
				System.out.println("URL:"+url);
				
				
			}
		}
		System.out.println("Active links:"+activelink.size());
		for(int j=0;j<activelink.size();j++)
		{
			URL url1=new URL(activelink.get(j).getAttribute("href"));
 			HttpURLConnection connect1=(HttpURLConnection) url1.openConnection();
			connect1.connect();
			String response=connect1.getResponseMessage();
			int code=connect1.getResponseCode();
			System.out.println(activelink.get(j).getAttribute("href")+"---->"+response+":"+code);
		}
	
		
}

  

}
