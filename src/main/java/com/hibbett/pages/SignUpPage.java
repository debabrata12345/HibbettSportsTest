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
//SignupButton
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='SIGN UP'])")
	private AndroidElement signupBtn;
//SignupForm
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
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.Button[@text='SIGN UP'])")
	private AndroidElement SignUpBtn1;
	
//FormValidtion
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='3'])")
	private AndroidElement fnReqValidation;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='4'])")
	private AndroidElement lnReqValidation;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='5'])")
	private AndroidElement phNoReqValidation;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='6'])")
	private AndroidElement emailReqValidation;
	
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@instance='7'])")
	private AndroidElement pwdReqValidation;

	
	public void enterSignUpScrn() {
		signupBtn.click();
	}
	
	public boolean validateSingUpTitle() {
		return signupTitle.isDisplayed();
	}
	
	public String[] reqValidation() {
		String[] ar1 = {fnReqValidation.getText(),lnReqValidation.getText(),
				phNoReqValidation.getText(),emailReqValidation.getText(),pwdReqValidation.getText()};
		return ar1;
	}

	public void tapOnSignUpButton() {
		SignUpBtn1.click();
	}
	public ShopPage doSignUp(String fname, String lname, String email, String pwd, String phoneno) {
		firstNameField.sendKeys(fname);
		lastNameField.sendKeys(lname);
		phoneNoField.sendKeys(phoneno);
		emailField.sendKeys(email);
		promoChckBox.click();
		pwdField.sendKeys(pwd);	
		driver.hideKeyboard();
		SignUpBtn1.click();
		return new ShopPage();
	}
	public ShopPage getIntoLoginScreen(){
		loginBtn.click();
		return new ShopPage();
	}
}
