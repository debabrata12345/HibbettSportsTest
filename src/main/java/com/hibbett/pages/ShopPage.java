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
    
    
    @CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Shop Tab'])")
	private AndroidElement shopTab;
    
    @CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Raffle and Launch Tab']")
	private AndroidElement launchesTap;
   
    @CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Shop My Store Tab'])")
	private AndroidElement smsTab;
   
    @CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Shopping Bag Tab'])")
	private AndroidElement bagTab;
   
    @CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Account Tab'])")
	private AndroidElement accountTab;
  
    @CacheLookup
  	@AndroidFindBy(id = "com.hibbett.android.corndog:id/tab_badge_text")
  	private AndroidElement badgeText;
    
     
    public boolean validateHibbettTitle() {
		return HibbettTitle.isDisplayed();
	}
	
    public AccountPage goToAccountScrn(){
    	accountTab.click();
		return new AccountPage();
    }
    
}
