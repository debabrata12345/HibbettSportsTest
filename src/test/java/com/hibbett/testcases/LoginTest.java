package com.hibbett.testcases;

import org.testng.annotations.Test;
import com.hibbett.base.Base;
import com.hibbett.base.TestCaseName;
import com.hibbett.pages.LoginPage;
import com.hibbett.pages.ShopPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends Base {
	LoginPage loginPage;
	ShopPage shopPage;

	public LoginTest() {
		super();
	}

	@BeforeMethod()//alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 0, groups = { "regression", "smoke" }, description = TestCaseName.testcase1)
	public void enterIntoLogin() {
		loginPage.enterLoginScrn();
		boolean flag = loginPage.validateLoginLogo();
		Assert.assertTrue(flag);
		System.out.println("User is on Login Screen");

	}

	@Test(priority = 1, groups ={"regression", "smoke" }, description = TestCaseName.testcase2)
	public void login() {
		loginPage.enterLoginScrn();
		shopPage = loginPage.doLogin(prop.getProperty("uid"), prop.getProperty("pwd"));
		//System.out.println(shopPage.HibbettTitle.getAttribute("name"));
		Assert.assertEquals("Hibbett", shopPage.HibbettTitle.getAttribute("name"));
		System.out.println("Successful Login is Done");
	}

	@AfterMethod
	public void afterMethod() {
		driver.resetApp();
	}
}
