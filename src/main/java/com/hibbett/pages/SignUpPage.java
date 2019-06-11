package com.hibbett.pages;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import com.hibbett.base.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage extends Base {
	public SignUpPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='SIGN UP'])")
	private AndroidElement signupBtn;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'SIGN UP')]")
	private AndroidElement signupTitle;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Log In')]")
	private AndroidElement loginBtn;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/firstName")
	private AndroidElement firstNameField;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/lastName")
	private AndroidElement lastNameField;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/phone")
	private AndroidElement phoneNoField;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/email")
	private AndroidElement emailField;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/subscribe_check_box")
	private AndroidElement promoChckBox;

	@CacheLookup
	@AndroidFindBy(id = "com.hibbett.android.corndog:id/password")
	private AndroidElement pwdField;

}
