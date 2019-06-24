package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.hibbett.base.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountPage extends Base{

	
	public AccountPage(){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
	    @CacheLookup
	    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='About Us'])")
	    private AndroidElement aboutUs;
	
	    
	    
	    
	    
	    
	    
	    
	    public Ac_AboutUsPage goToAboutUs(){
	    	aboutUs.click();
	    	return new Ac_AboutUsPage();
	    }
	
}
