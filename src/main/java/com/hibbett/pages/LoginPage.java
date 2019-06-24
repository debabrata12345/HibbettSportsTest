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
	private AndroidElement lgnBtn;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='LOG IN'])")
	private AndroidElement lgnTitleLogo;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/email")
	private AndroidElement uName;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/password")
	private AndroidElement pwd;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/snackbar_text")
	private AndroidElement snackbarText;
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='LOG IN'])")
	private AndroidElement lgnBtn1;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='3'])")
	private AndroidElement emailReqValidation;
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='4'])")
	private AndroidElement pwdReqValidation;

	public void enterLoginScrn() {
		lgnBtn.click();

	}

	public boolean validateLoginLogo() {
		return lgnTitleLogo.isDisplayed();
	}

	public ShopPage doLogin(String username, String password) {
		uName.sendKeys(username);
		pwd.sendKeys(password);
		driver.hideKeyboard();
		lgnBtn1.click();
		return new ShopPage();
	}

	public void invalidLoginTest(String username, String password) {
		uName.sendKeys(username);
		pwd.sendKeys(password);
		driver.hideKeyboard();
		lgnBtn1.click();
	}

	public String getSnackBarText() {
		System.out.println(snackbarText.getText());
		return snackbarText.getText();
	}

	public String[] reqValidation() {
		String[] ar1 = { emailReqValidation.getText(), pwdReqValidation.getText() };
		return ar1;
	}

	public void clickLogin() {
		lgnBtn1.click();
	}
}
