package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public void setUp()
	{
		if(driver == null)
		{				
			  WebDriverManager.chromedriver().setup();
	          ChromeOptions options=new ChromeOptions();
	          options.addArguments("--disable-notifications");
	          driver = new ChromeDriver(options);		
		}			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	public void tearDown()
	{
		 driver.close();
		// driver.quit();
	}
}
