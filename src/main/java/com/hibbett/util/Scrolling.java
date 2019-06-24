package com.hibbett.util;

import com.hibbett.base.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class Scrolling extends Base {
	//Scroll Down Till Element Found
	public static AndroidElement scrollDown(AndroidElement a){
		try{
		while(true){
			int YStartOffset=0;
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(PointOption.point(0, YStartOffset)).moveTo(PointOption.point(0, 100)).release().perform();
			YStartOffset=YStartOffset+50;
			if (a.isDisplayed())
				break;
		}}
		catch(Exception e){
			System.out.println("Element not found"+"\n" +"Below is the Exception: ");
			e.printStackTrace();
		}
		return a;
	}
}
