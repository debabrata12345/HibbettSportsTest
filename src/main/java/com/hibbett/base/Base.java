package com.hibbett.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.hibbett.util.TestUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base{

	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
    public static DesiredCapabilities caps;
	public Base() {
		try {
			prop = new Properties();
			File fl= new File("/Users/debabratabaidya/Documents/workspace/HibbettSportsTest/"
					+ "src/main/java/com/hibbett/config/hibbettconfig.properties");
			FileInputStream ip = new FileInputStream(fl);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws InterruptedException {
		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", prop.getProperty("deviceName"));
		caps.setCapability("udid", prop.getProperty("udid"));
		caps.setCapability("platformName", prop.getProperty("platformName"));
		caps.setCapability("platformVersion", prop.getProperty("platformVersion"));
		caps.setCapability("appPackage", prop.getProperty("appPackage"));
		caps.setCapability("appActivity", prop.getProperty("appActivity"));
		caps.setCapability("noReset", prop.getProperty("noReset"));
		//caps.setCapability("fullReset", prop.getProperty("fullReset"));
		System.out.println("Listening on URL: "+prop.getProperty("url") + ":" + 
		prop.getProperty("port") + "/wd/hub");
		try {
			driver = new AndroidDriver<MobileElement>(
					new URL(prop.getProperty("url") + ":" + prop.getProperty("port") + "/wd/hub"), caps);
		} catch (MalformedURLException e) {
			System.out.println("Exception on Connection is: "+ e);
		}
		System.out.println("DriverIntialized at"+prop.getProperty("url") + ":" + prop.getProperty("port") + "/wd/hub");
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

}
