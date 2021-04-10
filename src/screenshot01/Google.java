package screenshot01;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File src=((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
	    File des=new File("./Screenshot/google.png");
	    Files.copy(src, des);
	    
	    
	    
	    
	    
}
}
