package Baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
public static void intillization(String url) 
{System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mhetre\\\\Downloads\\\\chromedriver_win32\\\\chromedriver\\\\chromedriver.exe");
driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get(url);
}
}
