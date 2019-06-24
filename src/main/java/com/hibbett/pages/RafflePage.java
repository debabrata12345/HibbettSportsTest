package com.hibbett.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.hibbett.base.Base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RafflePage extends Base {
		public RafflePage() {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		// RaffleOpenTag
		@CacheLookup
		@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Raffle Entry is Open'])")
		private AndroidElement raffleOpenTag;
	
	
	
	
	
}
