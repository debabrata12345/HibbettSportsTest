package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.hibbett.base.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SmsPage extends Base {

	public SmsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='GET STARTED'])")
	private AndroidElement getStarted;

	@CacheLookup
	//@AndroidFindBy(xpath = "(//android.widget.TextView[@text='More Info'])")
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/tv_more_info")
	private AndroidElement moreInfo;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='SHOP A STORE'])")
	private AndroidElement shopAStorePageTitle;
	
	@CacheLookup
	
	@AndroidFindBy(id = "back")
	private AndroidElement closeButtonShop_A_StorePage;
	

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Shop a Store'])")
	private AndroidElement shopStoreTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='SHOP MY STORE'])")
	private AndroidElement shopMyStoreTitle;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Sports'])")
	private AndroidElement sportsCategory;
	
	
	public void tapOnMoreInfoButton(){
		
		
	}
	
	
}