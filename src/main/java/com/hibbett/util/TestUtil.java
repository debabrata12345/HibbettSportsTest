package com.hibbett.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hibbett.base.Base;

public class TestUtil extends Base {
	public static long IMPLICIT_WAIT = 10;

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

	public static void takeScrnShot(String methodName) throws IOException {
	 //public static void main (String[] args){
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
		// System.out.println(System.getProperty("user.dir") + "_" + "/screenshots/" + "test" + "_" + year + "_"
				//	+ month + "_" + date + "_" + hour + "_" + min + "_" + sec) ;
	// Test

}
