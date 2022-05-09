package Utils.layer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baselayer.baseclass;

public class DropdownMethod extends baseclass {
public static Select sel;
	public static String selectbyvalue(WebElement wb,String value) {
		sel=new Select(wb);
		sel.selectByValue(value);
		String selectedvalue=sel.getFirstSelectedOption().getText();
		return selectedvalue;
	}
	public static String selectbyvisibletext(WebElement wb,String text) {
        sel=new Select(wb);
		sel.selectByVisibleText(text);
		String selectedvalue=sel.getFirstSelectedOption().getText();
		return selectedvalue;
	}
	public static String selectbyindex(WebElement wb,int index) {
		new Select(wb).selectByIndex(index);
		String selectedvalue=sel.getFirstSelectedOption().getText();
		return selectedvalue;
	}
	public static String seealldropdownoption() {
		
		List<WebElement> ls=sel.getOptions();
		for(WebElement abc:ls) {
			 String values=abc.getText();
		}
		return null;
		
	}
}
