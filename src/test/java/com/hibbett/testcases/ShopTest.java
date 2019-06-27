package com.hibbett.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hibbett.base.Base;
import com.hibbett.base.TestCaseName;
import com.hibbett.pages.Ac_AboutUsPage;
import com.hibbett.pages.LandingPage;
import com.hibbett.pages.ShopPage;
public class ShopTest extends Base{
	
	ShopPage shopPage;
	LandingPage landingPage;
	
	public ShopTest() {
		super();
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		landingPage = new LandingPage();
		shopPage = new ShopPage();
		Thread.sleep(2000);
		shopPage = landingPage.browseAsGuest();
		}
	
	@Test(enabled=false, priority = 34, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE301)
	public void validateOpenSourceLicense() throws InterruptedException {
		//shopPage.clickSocks();
		//Assert.assertEquals("Open Source Libraries", aboutUs.openSourcePageTitleTextValidation());// .getAttribute("name"));
		
	}
	
	@Test(priority = 33, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE206)
	public void selectStoreValidation() throws InterruptedException {
		//shopPage.clickSocks();
		//Assert.assertEquals("Open Source Libraries", aboutUs.openSourcePageTitleTextValidation());// .getAttribute("name"));
		shopPage.storeSelector();
		//boolean flag = shopPage.validateStoreTitle();
		System.out.println(shopPage.validateStoreTitle());
		Assert.assertTrue(shopPage.validateStoreTitle());
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.resetApp();
	}

}
