package Utils.layer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baselayer.baseclass;

public class Takescreenshot extends baseclass {
public static void takesscreenshot(String text) throws IOException {
TakesScreenshot ts=(TakesScreenshot) driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("C:\\Users\\Mhetre\\OneDrive\\Desktop\\mayur softech\\OrangeHRM\\PassScreenshot\\"+text+".png"));
}
}
