package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        ChromeOptions c=new ChromeOptions();
       // c.setHeadless(true);
        c.addArguments("--headless");
		WebDriver b=new ChromeDriver(c);
		b.manage().window().maximize();
		b.get("https://www.facebook.com/");
		System.out.println(b.getTitle());
}
}
