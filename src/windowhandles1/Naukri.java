package windowhandles1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-geolocation");
		WebDriver b=new ChromeDriver(co);
		b.get("https://www.naukri.com/");
		b.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		b.manage().window().maximize();
		String parent=b.getWindowHandle();
		System.out.println(parent);
		Set<String> windows1= b.getWindowHandles();
	    List<String> win=new ArrayList<String>(windows1);
	    System.out.println(win.size());
	    for(int i=win.size()-1;i>0;i--)
	    {
	    	System.out.println(b.switchTo().window(win.get(i)).getTitle());
	    	b.close();
	    
	    }
	     b.switchTo().window(parent);
	     System.out.println(b.getTitle());
	     b.findElement(By.xpath("//input[@id='qsb-keyword-sugg']")).sendKeys("infosys");
	     
}
}
