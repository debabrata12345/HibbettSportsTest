package com.hibbett.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Dummy {
	public static AppiumDriver<MobileElement> driver;

	public Dummy() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Clearance'])")
	private static AndroidElement catgory;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Men'])")
	private static AndroidElement menCategory;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Men's Clothing'])")
	private static AndroidElement menShoesCategory;

	public static AndroidElement scrollDown(AndroidElement a) {
		int count = 0;
		try {
			while (true) {
				int YStartOffset = 0;
				TouchAction touchAction = new TouchAction(driver);
				touchAction.longPress(PointOption.point(10, YStartOffset)).moveTo(PointOption.point(10, 100)).release()
						.perform();
				count++;
				// YStartOffset=YStartOffset+50;
				Thread.sleep(1500);

				if (a.isDisplayed())
					break;
			}
		} catch (Exception e) {
			System.out.println("Element not found" + "\n" + "Below is the Exception: ");
			e.printStackTrace();
			scrollDown(a);
		}
		System.out.println("count=" + count);
		return a;
	}

	
	
	public static void scrolldown(){
		Dimension dimension = driver.manage().window().getSize();
		Double scrollHeightStart = dimension.getHeight() * 0.8;
		int scrollStart = scrollHeightStart.intValue();
		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();		
		new TouchAction((PerformsTouchActions)driver).press(PointOption.point(0,scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(0,scrollEnd)).release().perform();
		
}
	public MobileElement getItemViews(){	
		return driver.findElement(By.xpath("(//android.widget.TextView[@text='Clothing'])"));		
	}
	
	public static List<MobileElement> getItemWebView(){
		
		return driver.findElements(By.xpath("(//android.widget.TextView[@text='Socks'])"));		
	}
	
	
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// DummyRunner dr=new DummyRunner();

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "e7accc93");
		caps.setCapability("udid", "e7accc93");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", 9);
		caps.setCapability("appPackage", "com.hibbett.android.corndog");
		caps.setCapability("appActivity", "com.hibbett.android.navigation.NavigationActivity_");
		caps.setCapability("noReset", true);
		// driver.findElement(By.xpath("//android.widget.Button[@text='LOG
		// IN']")).click();
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		// Thread.sleep(10000);
		// driver.findElement(By.xpath("//android.widget.Button[@text='SIGN
		// UP'])")).click();
		System.out.println("initialized");
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		// MobileElement search=
		// driver.findElement(By.id("com.hibbett.android.corndog:id/search"));
		// MobileElement search1=
		// driver.findElement(By.xpath("(//android.widget.TextView[@text='Men's
		// Clothing'])"));
		Thread.sleep(5000);
		// driver.hideKeyboard();

		// TouchAction touchAction = new TouchAction(driver);
		// touchAction.longPress(PointOption.point(0,
		// 800)).moveTo(PointOption.point(0, 100)).release().perform();
		// AndroidElement t= (AndroidElement)
		// driver.findElement(By.xpath("(//android.widget.TextView[@text='Shop
		// My Store'])"));

		// new Dummy().scrollDown(menShoesCategory);
		// menShoesCategory.click();
		// new
		// TouchAction(driver).longPress(search1).moveTo(PointOption.point(0,
		// 100).release();
		// while (true){
		// for (int i=1;i>0;i++){
		// int endY=700;
		// (new TouchAction(driver))
		// .press(PointOption.point(625, 1000))
		// .moveTo(PointOption.point(625, endY))
		// .release()
		// .perform();

		// if
		// (driver.findElement(By.xpath("(//android.widget.TextView[@text='Clothing'])")).isDisplayed()){
		// break;

		// driver.findElement(By.xpath("(//android.widget.TextView[@text='Clothing'])")).click();

		while (getItemWebView().size()==0){
			scrolldown();}
			if(getItemWebView().size()>0){		
				getItemWebView().get(0).click();
			}
			Thread.sleep(4000);
		}

	}

