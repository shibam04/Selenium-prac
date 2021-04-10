package flipkart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		System.out.println(image.size());
		links.addAll(image);
		System.out.println("After adding links +image:"+links.size());
		/* List<WebElement> newlink=new ArrayList<WebElement>();
	  for(int k=0;k<links.size();k++)
	  {
		  if(links.get(k).getAttribute("href")!=null)
		  {
			  newlink.add(links.get(k));
			  System.out.println("New Link after removing null links:"+newlink.size());
		  }
	  }
	  for(int i=0;i<newlink.size();i++)
	  {
		  URL url=new URL(newlink.get(i).getAttribute("href"));
		  HttpURLConnection urls=( HttpURLConnection)url.openConnection();
		  urls.connect();
		  String response=urls.getResponseMessage();
		  int code=urls.getResponseCode();
		  System.out.println(links.get(i).getAttribute("href")+"---->"+response+":"+code);

	  }*/
		Actions a=new Actions(driver);

		
		List<WebElement> menus= driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
		for(WebElement menus1:menus)
		{
			String name=menus1.getText();
			System.out.println("Name:"+name);
			a.moveToElement(menus1).perform();
			if(name.equalsIgnoreCase("electronics"))
			{
				a.moveToElement(menus1).perform();
				List<WebElement>submenus=  driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
				for(WebElement submenu:submenus)
				{
					Thread.sleep(2000);
					String sub=submenu.getText();
					System.out.println("Submenu:"+sub);
					a.moveToElement(submenu).perform();
					if(sub.equalsIgnoreCase("storage"))
					{
			
						a.moveToElement(submenu).click().perform();
						break;
					}
				}
				WebElement select1=driver.findElement(By.xpath("//div[@class='_1YAKP4']/select"));
				Select s=new Select(select1);
				s.selectByValue("5000");
				Thread.sleep(3000);
				WebElement select2=driver.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
				Select s1=new Select(select2);
				s1.selectByVisibleText("₹20000");
				Thread.sleep(4000);	
				JavascriptExecutor js=(	JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('style','border:4px solid red;background:yellow');",select2);
				WebElement pen=driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='DM Aiplay 512 GB External Solid State Drive']"));
				pen.click();
				
				Set<String> page=driver.getWindowHandles();
				List<String> win=new ArrayList<String>(page);
			
				System.out.println("Size:"+win.size());
				for(int z=win.size()-1;z>0;z--)
				{
					driver.switchTo().window(win.get(z));
					WebElement d=driver.findElement(By.xpath("//a[@title='SanDisk 500 GB External Solid State Drive' and @class='s1Q9rs' ]"));
					js.executeScript("arguments[0].scrollIntoView(true);",d);
					d.click();
					Set<String> page1=driver.getWindowHandles();
					List<String> win2=new ArrayList<String>(page1);
					System.out.println("Size1:"+win2.size());
					
					//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				}
				//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				break;

			}
		}
		

	}
}




