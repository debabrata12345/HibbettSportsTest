package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.hibbett.base.Base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='LOG IN'])")
	private AndroidElement LoginButton;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='LOG IN'])")
	private AndroidElement LoginTitleLogo;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/email")
	private AndroidElement uname;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/password")
	private AndroidElement pwd;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/snackbar_text")
	private AndroidElement snackbarText;
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='LOG IN'])")
	private AndroidElement LoginButton1;

	public void enterLoginScrn() {
		LoginButton.click();

	}

	public boolean validateLoginLogo() {
		return LoginTitleLogo.isDisplayed();
	}

	public ShopPage doLogin(String username, String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
		driver.hideKeyboard();
		LoginButton1.click();
		return new ShopPage();
	}

	public void invalidLoginTest(String username, String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
		driver.hideKeyboard();
		LoginButton1.click();
	}

	public String getSnackBarText() {
		System.out.println(snackbarText.getText());
		return snackbarText.getText();
	}
}
