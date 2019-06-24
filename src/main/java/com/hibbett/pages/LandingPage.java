package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.hibbett.base.Base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage extends Base {
	public LandingPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Login Button
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='LOG IN'])")
	private AndroidElement lgnBtn;

	// SignupButton
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='SIGN UP'])")
	private AndroidElement signupBtn;

	// Browse As Guest
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Browse as Guest'])")
	private AndroidElement guestBtn;

	// HibbettLogo
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Hibbett Sports Logo'])")
	private AndroidElement hibbettLogo;

	public boolean validateHibbettLogo() {
		return hibbettLogo.isDisplayed();
	}

	public ShopPage browseAsGuest() {
		guestBtn.click();
		return new ShopPage();
	}
}