package com.hibbett.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hibbett.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestUtil extends Base {
	public static long IMPLICIT_WAIT = 10;

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

	public static void takeScrnShot(String methodName) throws IOException {
		// public static void main (String[] args){
		Calendar cal = new GregorianCalendar();
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String scrnShotPath = System.getProperty("user.dir") + "_" + "/screenshots/" + methodName + "_" + year + "_"
				+ month + "_" + date + "_" + hour + "_" + min + "_" + sec;
		FileUtils.copyFile(src1, new File(scrnShotPath));
	}

	// public static void main (String[] args){
	// System.out.println(System.getProperty("user.dir"));}
	// System.out.println(System.getProperty("user.dir") + "_" + "/screenshots/"
	// + "test" + "_" + year + "_"
	// + month + "_" + date + "_" + hour + "_" + min + "_" + sec) ;
	// Test

	// ScrollDown Function
	public static void scrollDown() throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Double scrollHeightStart = dimension.getHeight() * 0.7;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
		//Thread.sleep(1000);

	}

	public static void scrollRight() throws InterruptedException {
		Dimension dimension = driver.manage().window().getSize();
		Double scrollWidthStart = dimension.getWidth() * 0.5;
		int scrollStart = scrollWidthStart.intValue();
		Double scrollWidthEnd = dimension.getWidth() * 0.2;
		int scrollEnd = scrollWidthEnd.intValue();
		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStartH = scrollHeightStart.intValue();
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, scrollStartH))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(scrollEnd, scrollStartH))
				.release().perform();
		//Thread.sleep(1000);

	}

	public static List<MobileElement> getItemWebView() {
		return driver.findElements(By.xpath("(//android.widget.TextView[@text='Socks'])"));
	}

	public static List<MobileElement> getItemWebView1() {
		return driver.findElements(By.xpath("(//android.widget.TextView[@text='Hats'])"));
	}
	public static List<MobileElement> getItemWebView1(MobileElement b) {
		List<MobileElement> a = new java.util.ArrayList<MobileElement>();
		a.add(b);
		return a;
	}

	// while (getItemWebView().size()==0){
	// scrolldown();}
	// if(getItemWebView().size()>0){
	// getItemWebView().get(0).click();
	// }
	// Thread.sleep(4000);
	// }

}
