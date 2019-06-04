package com.hibbett.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {

	int retrycount = 1;
	int maxretrycount = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (retrycount < maxretrycount) {
			retrycount++;
			return true;
		}

		return false;

	}

}
