package Utils.layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baselayer.baseclass;

public class FrameMethod extends baseclass {

	public static WebDriver switchtochildwindowbyname(String name) {
		 return driver.switchTo().frame(name);
	}
	public static WebDriver switchtochildwindowbyname(WebElement wb) {
		 return driver.switchTo().frame(wb);
	}
	public static WebDriver switchtochildwindowbyname(int index) {
		 return driver.switchTo().frame(index);
	}
	public static WebDriver switchtoparentframe() {
		 return driver.switchTo().parentFrame();
	}
	public static WebDriver switchtomainframe() {
		 return driver.switchTo().defaultContent();
	}


}
