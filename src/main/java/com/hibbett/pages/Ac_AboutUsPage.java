package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.hibbett.base.Base;
import com.hibbett.util.Scrolling;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Ac_AboutUsPage extends Base {

	public Ac_AboutUsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// OpenSource
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Open Source Licenses'])")
	private AndroidElement openSourceLicense;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Open Source Libraries'])")
	private AndroidElement openSourcePageTitle;

	// OurStory
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Our Story'])")
	private AndroidElement ourStory;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='OUR STORY'])")
	private AndroidElement ourStoryPageTitle;

	// HibbettUniversity
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Hibbett University'])")
	private AndroidElement hibbettUniversity;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='HIBBETT UNIVERSITY'])")
	private AndroidElement hibbettUniversityPageTitle;

	// Philanthropy
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Philanthropy'])")
	private AndroidElement philanthropy;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='PHILANTHROPY'])")
	private AndroidElement philanthropyPageTitle;

	// InvestorRelations
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Investor Relations'])")
	private AndroidElement investorRelations;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='INVESTOR RELATIONS'])")
	private AndroidElement investorRelationsPageTitle;

	// Careers
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Careers'])")
	private AndroidElement careers;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='CAREERS'])")
	private AndroidElement careerPageTitle;

	// Raffle terms of use
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Raffle Terms And Conditions'])")
	private AndroidElement raffleTermsAndCondition;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='RAFFLE TERMS AND CONDITIONS'])")
	private AndroidElement raffleTermsAndConditionPageTitle;

	// Privacy Policy
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Privacy Policy'])")
	private AndroidElement privacyPolicy;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='PRIVACY POLICY'])")
	private AndroidElement privacyPolicyPageTitle;

	// Terms of Use
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Terms of Use'])")
	private AndroidElement termsOfUse;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='TERMS OF USE'])")
	private AndroidElement termsOfUsePageTitle;

	// California Disclosures
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='California Disclosures'])")
	private AndroidElement californiaDisclosoures;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='CALIFORNIA DISCLOSURES'])")
	private AndroidElement californiaDisclosouresPageTitle;

	// Accessibility
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Accessibility'])")
	private AndroidElement accessibility;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='ACCESSIBILITY'])")
	private AndroidElement accessibilityPageTitle;

	// Open Source
	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Open Source Licenses'])")
	private AndroidElement openSourceLicenses;

	@CacheLookup
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='INVESTORY RELATIONS'])")
	private AndroidElement openSourceLicensesPageTitle;

	// public boolean validateOpenSourcePageTitle() {
	// return openSourcePageTitle.isDisplayed();
	// }

	public String openSourcePageTitleTextValidation() {
		System.out.println(openSourcePageTitle.getText());
		return openSourcePageTitle.getText();
	}

	public String accessibilityPageTitleValidation() {
		System.out.println(accessibilityPageTitle.getText());
		return accessibilityPageTitle.getText();
	}

	public String californiaDisclosouresPageTitleTextValidation() {
		System.out.println(californiaDisclosouresPageTitle.getText());
		return californiaDisclosouresPageTitle.getText();
	}

	public String termsOfUsePageTitleTextValidation() {
		System.out.println(termsOfUsePageTitle.getText());
		return termsOfUsePageTitle.getText();
	}

	public String privacyPolicyPageTitleTextValidation() {
		System.out.println(privacyPolicyPageTitle.getText());
		return privacyPolicyPageTitle.getText();
	}

	public String raffleTermsAndConditionPageTitleTextValidation() {
		System.out.println(raffleTermsAndConditionPageTitle.getText());
		return raffleTermsAndConditionPageTitle.getText();
	}

	public String careerPageTitleTextValidation() {
		System.out.println(careerPageTitle.getText());
		return careerPageTitle.getText();
	}

	public String investorRelationsPageTitleTextValidation() {
		System.out.println(investorRelationsPageTitle.getText());
		return investorRelationsPageTitle.getText();
	}

	public String philanthropyPageTitleTextValidation() {
		System.out.println(philanthropyPageTitle.getText());
		return philanthropyPageTitle.getText();
	}

	public String hibbettUniversityPageTitleTextValidation() {
		System.out.println(hibbettUniversityPageTitle.getText());
		return hibbettUniversityPageTitle.getText();
	}

	public String ourStoryPageTitleTextValidation() {
		System.out.println(ourStoryPageTitle.getText());
		return ourStoryPageTitle.getText();
	}

	public void goToOurStory() {
		ourStory.click();
	}

	public void goTohibbettUniversity() {
		hibbettUniversity.click();
	}

	public void goToPhilanthropy() {
		philanthropy.click();
	}

	public void goToInverstoryRelations() {
		investorRelations.click();
	}

	public void goToCareers() {
		careers.click();
	}

	public void goToRaffleTermsAndConditions() {
		raffleTermsAndCondition.click();
	}

	public void goToPrivacyPolicy() {
		privacyPolicy.click();
	}

	public void goToTermsOfUse() {
		termsOfUse.click();
	}

	public void goToCaliforniaDisclosures() {

		californiaDisclosoures.click();
	}

	public void goToAccessibility() {
		accessibility.click();
	}

	public void goToOpenSourceLicense() {
		Scrolling.scrollDown(openSourceLicense);
		openSourceLicense.click();
	}

}
