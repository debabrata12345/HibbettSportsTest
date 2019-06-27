package com.hibbett.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.hibbett.base.Base;
import com.hibbett.util.TestUtil;

import io.appium.java_client.MobileElement;
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
    
    @CacheLookup
  	@AndroidFindBy(id ="com.hibbett.android.corndog:id/search")
  	private AndroidElement searchBox;
    
    
    
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.TextView[contains(@text,'Tap to find a store for Free Pick Up & Reservations!')])")
  	private AndroidElement storeSelector;
  		  	
    
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.Button[contains(@text,'ALLOW')])")
  	private AndroidElement allowAccess;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.TextView[contains(@text,'Search for City & State or Zip')])")
  	private AndroidElement citySearch;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.EditText[contains(@text,'Search')])")
	private AndroidElement enterGoogleSearch;
	

	@CacheLookup
  	@AndroidFindBy(id="com.google.android.gms:id/edit_text")
	private AndroidElement enterCity;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.RelativeLayout[@index='0'])")
	private AndroidElement selectNYC;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.TextView[@text='18 Broadway']/parent::android.widget."
  			+ "LinearLayout/following-sibling::android.widget.LinearLayout)")
	private AndroidElement selectBroadway;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.TextView[@text='APPLY'])")
	private AndroidElement storeApplyButton;
	
	@CacheLookup
  	@AndroidFindBy(id="com.hibbett.android.corndog:id/store_checkbox")
	private AndroidElement storeCheckbox;
	
	@CacheLookup
  	@AndroidFindBy(xpath="(//android.widget.TextView[@text='18 Broadway, Browns Mills, NJ 08015-3248'])")
	private AndroidElement broadWAY;
	
	
	
	
    public void storeSelector() throws InterruptedException{
    	searchBox.click();
    	storeSelector.click();
    	allowAccess.click();
    	citySearch.click();
    	enterGoogleSearch.click();
    	enterCity.sendKeys("nyc");
    	driver.hideKeyboard();
    	selectNYC.click();
        selectBroadway.click();
        storeApplyButton.click();
        Thread.sleep(5000);
    }
    
    public boolean validateStoreTitle() {
		return broadWAY.isDisplayed();
	}
    
    
    @CacheLookup
    @FindBys({@FindBy(xpath ="(//android.widget.TextView[@text='Socks'])")})   
    List<MobileElement> socksTile1;
    
  
    @FindBy(xpath ="(//android.widget.TextView[@text='Socks'])")    
    public List<MobileElement> socksTile;
    
    
   // (//android.widget.ImageView[@instance='2'])
    
    
    
    
    
    
    
    
    
    
    public static List<MobileElement> getSocksTileInView() {
		return driver.findElements(By.xpath("(//android.widget.TextView[@text='Socks'])"));
	}

	public static List<MobileElement> getHatsTileInView() {
		return driver.findElements(By.xpath("(//android.widget.TextView[@text='Hats'])"));
	}
    public void clickSocks() throws InterruptedException{
    	while (getSocksTileInView().size()==0){
    		TestUtil.scrollDown();
    		}
    		if(getSocksTileInView().size()>0){	
    			while (getHatsTileInView().size()==0){
    	    		TestUtil.scrollRight();
    	    		}
    			}
    		if(getHatsTileInView().size()>0){
    			getHatsTileInView().get(0).click();
    		}
    		//Thread.sleep(4000);
    	}
    
    public void clickSocks1() throws InterruptedException{
    	while (socksTile.size()==0){
    		TestUtil.scrollDown();
    		}
    		if(socksTile.size()>0){		
    			socksTile.get(0).click();
    		}
    		System.out.println("````Size is `````="+socksTile.size());
    		Thread.sleep(4000);
    	}
    
    
    
    
    
    
    
    
    
    
    
    public boolean validateHibbettTitle() {
		return HibbettTitle.isDisplayed();
	}
	
    public AccountPage goToAccountScrn(){
    	accountTab.click();
		return new AccountPage();
    }
    
}
