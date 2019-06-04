package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.hibbett.base.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShopPage extends Base{
	public ShopPage(){
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

    @CacheLookup
    @AndroidFindBy(id = "Hibbett")
    public AndroidElement HibbettTitle;
	
}
