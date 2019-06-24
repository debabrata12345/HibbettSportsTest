package com.hibbett.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class Dummy {
	public static AppiumDriver<MobileElement> driver;
	public Dummy() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Shop My Store'])")
	private static AndroidElement catgory;
	
	public  AndroidElement scrollDown(AndroidElement a){
		int count=0;
		try{
		while(0==0){
			int YStartOffset=0;
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(PointOption.point(10, YStartOffset)).moveTo(PointOption.point(10, 100)).release().perform();
			count++;
			//YStartOffset=YStartOffset+50;
			if (a.isDisplayed())
				break;
		}}
		catch(Exception e){
			System.out.println("Element not found"+"\n" +"Below is the Exception: ");
			e.printStackTrace();
		}
		System.out.println(count);
		return a;	
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//DummyRunner dr=new DummyRunner();
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "e7accc93");
		caps.setCapability("udid", "e7accc93");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", 9);
		caps.setCapability("appPackage", "com.hibbett.android.corndog");
		caps.setCapability("appActivity", "com.hibbett.android.navigation.NavigationActivity_");
		caps.setCapability("noReset", true);
//		driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		 //Thread.sleep(10000);
		//driver.findElement(By.xpath("//android.widget.Button[@text='SIGN UP'])")).click();
		 System.out.println("initialized");
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.findElement(By.id("com.hibbett.android.corndog:id/search")).click();	 
		 Thread.sleep(5000);
		 driver.hideKeyboard();
		
		//TouchAction touchAction = new TouchAction(driver);
		//touchAction.longPress(PointOption.point(0, 800)).moveTo(PointOption.point(0, 100)).release().perform();
		//AndroidElement t= (AndroidElement) driver.findElement(By.xpath("(//android.widget.TextView[@text='Shop My Store'])"));
		
		
		new Dummy().scrollDown(catgory);
		catgory.click();







		 
		 
	}
	}

	