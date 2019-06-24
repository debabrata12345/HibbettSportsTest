package com.hibbett.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hibbett.base.Base;
import com.hibbett.base.TestCaseName;
import com.hibbett.pages.Ac_AboutUsPage;
import com.hibbett.pages.AccountPage;
import com.hibbett.pages.LandingPage;
import com.hibbett.pages.ShopPage;

public class Ac_AboutUsTest extends Base {
	ShopPage shopPage;
	LandingPage landingPage;
	AccountPage accountPage;
	Ac_AboutUsPage aboutUs;

	public Ac_AboutUsTest() {
		super();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		aboutUs = new Ac_AboutUsPage();
		landingPage = new LandingPage();
		shopPage = new ShopPage();
		accountPage = new AccountPage();

		Thread.sleep(2000);
		shopPage = landingPage.browseAsGuest();
		boolean flag = shopPage.validateHibbettTitle();
		//System.out.println(flag);
		Assert.assertTrue(flag);
		accountPage = shopPage.goToAccountScrn();
		Thread.sleep(2000);
		aboutUs = accountPage.goToAboutUs();
	}

	@Test(priority = 14, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE101)
	public void validateOpenSourceLicense() throws InterruptedException {
		aboutUs.goToOpenSourceLicense();
		Assert.assertEquals("Open Source Libraries", aboutUs.openSourcePageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 15, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE102)
	public void validateAccessibility() throws InterruptedException {
		aboutUs.goToAccessibility();
		Thread.sleep(2000);
		Assert.assertEquals("ACCESSIBILITY", aboutUs.accessibilityPageTitleValidation());// .getAttribute("name"));

	}

	@Test(priority = 16, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE103)
	public void validateCaliforniaDisclosures() throws InterruptedException {
		aboutUs.goToCaliforniaDisclosures();
		Assert.assertEquals("CALIFORNIA DISCLOSURES", aboutUs.californiaDisclosouresPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 17, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE104)
	public void validateTermsOfUse() throws InterruptedException {
		aboutUs.goToTermsOfUse();
		Assert.assertEquals("TERMS OF USE", aboutUs.termsOfUsePageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 18, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE105)
	public void validatePrivacyPolicy() throws InterruptedException {
		aboutUs.goToPrivacyPolicy();
		Assert.assertEquals("PRIVACY POLICY", aboutUs.privacyPolicyPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 19, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE106)
	public void validateRaffleTermsAndCondition() throws InterruptedException {
		aboutUs.goToRaffleTermsAndConditions();
		Assert.assertEquals("RAFFLE TERMS AND CONDITIONS", aboutUs.raffleTermsAndConditionPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 20, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE107)
	public void validateCareers() throws InterruptedException {
		aboutUs.goToCareers();
		;
		Assert.assertEquals("CAREERS", aboutUs.careerPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 21, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE108)
	public void validateInvestorRelations() throws InterruptedException {
		aboutUs.goToInverstoryRelations();
		Assert.assertEquals("INVESTOR RELATIONS", aboutUs.investorRelationsPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 22, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE109)
	public void validatePhilanthropy() throws InterruptedException {
		aboutUs.goToPhilanthropy();
		Assert.assertEquals("PHILANTHROPY", aboutUs.philanthropyPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 23, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE110)
	public void validateHibbettUniversity() throws InterruptedException {
		aboutUs.goTohibbettUniversity();
		Assert.assertEquals("HIBBETT UNIVERSITY", aboutUs.hibbettUniversityPageTitleTextValidation());// .getAttribute("name"));

	}

	@Test(priority = 24, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE111)

	public void validateOurStory() throws InterruptedException {
		aboutUs.goToOurStory();
		Assert.assertEquals("OUR STORY", aboutUs.ourStoryPageTitleTextValidation());// .getAttribute("name"));

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.resetApp();
	}

}