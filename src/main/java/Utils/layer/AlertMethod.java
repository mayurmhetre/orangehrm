package Utils.layer;

import org.openqa.selenium.Alert;

import Baselayer.baseclass;

public class AlertMethod extends baseclass {
	public static Alert alt;
     public static String getalerttext() 
       {
	  alt=driver.switchTo().alert();
	  return alt.getText();
	  }
	 public static void clickonokbutton() {
		 alt.accept();
	 }
	 public static void clickoncancelbutton() {
		 alt.dismiss();
	 }
	 public static void sendvaluetotextbox(String text) {
		 alt.sendKeys(text);
	 }
	
}

