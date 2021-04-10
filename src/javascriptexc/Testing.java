package javascriptexc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Testing 
{
  public static void main(String[] args) throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
       ChromeOptions co=new ChromeOptions();
       co.addArguments("--disable-notifications");
		WebDriver b=new ChromeDriver(co);
		b.manage().window().maximize();
		b.get("`");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement img=b.findElement(By.xpath("//img[@alt='WebElement Hierarchy']"));
		JavascriptExecutor js=(JavascriptExecutor)b;
		js.executeScript("arguments[0].scrollIntoView(true);", img);
		WebDriverWait w=new WebDriverWait(b,10);
		w.until(ExpectedConditions.visibilityOf(img));
		ScreenShot(b,"Test1");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		ScreenShot(b,"Test2");
		
}
  public static void ScreenShot(WebDriver b,String x) throws IOException
  {
	   File source=((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+x+".png");
		Files.copy(source,des);
  }
}
