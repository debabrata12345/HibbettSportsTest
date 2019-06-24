package com.hibbett.util;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hibbett.base.Base;

public class TakesScreenshotOnFailure extends Base implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}
//__________________________________________________________________________________
	@Override
	public void onTestFailure(ITestResult result) {
		try {

			TestUtil.takeScrnShot(result.getName().toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Takesscreenshot broken");
		}

	}
//__________________________________________________________________________________
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
