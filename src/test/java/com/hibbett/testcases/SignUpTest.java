package com.hibbett.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hibbett.base.Base;
import com.hibbett.base.TestCaseName;
import com.hibbett.pages.LoginPage;
import com.hibbett.pages.ShopPage;
import com.hibbett.pages.SignUpPage;

public class SignUpTest extends Base {
	SignUpPage singupPage;
	ShopPage shopPage;
	public SignUpTest() {
		super();
	}

	@BeforeMethod(  alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		singupPage = new SignUpPage();
	}

	@Test(priority = 4, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE5)
	public void enterIntoSignUpScrn() {
		singupPage.enterSignUpScrn();
		boolean flag = singupPage.validateSingUpTitle();
		Assert.assertTrue(flag);
		System.out.println("User is on Signup Screen");

	}

	@Test(priority = 5, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE6)
	public void fieldValidationCheck() {
		singupPage.enterSignUpScrn();
		singupPage.tapOnSignUpButton();
		String[] ar2 = singupPage.reqValidation();
		for (String str : ar2) {
			Assert.assertEquals(str, "Required");
		}
		System.out.println("Field Validation is checked");
	}

	@Test(priority = 6, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE7)
	public void getIntoLoginScrn() {
		singupPage.enterSignUpScrn();
		singupPage.getIntoLoginScreen();
		boolean flag = new LoginPage().validateLoginLogo();
		Assert.assertTrue(flag);
		System.out.println("User is on Login Screen");
	}

	@Test(priority = 7, groups = { "regression", "smoke" }, description = TestCaseName.TESTCASE8)
	public void SignUp() {
		singupPage.enterSignUpScrn();
		shopPage = singupPage.doSignUp("AutoFname", "AutoLastName",
				"autotest" + Integer.toString((int) (Math.random() * 100)) + "@gmail.com", "Abcd1234", "2039369191");
		// System.out.println(shopPage.HibbettTitle.getAttribute("name"));
		Assert.assertEquals("Hibbett", shopPage.HibbettTitle.getAttribute("name"));
		System.out.println("Successful SignUp is Done");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.resetApp();
	}

}
