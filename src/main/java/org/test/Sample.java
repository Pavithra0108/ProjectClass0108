package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;

public class Sample extends BaseClass{
public static void main(String[] args) {
	WebDriver driver= chromeBrowser();
	urlLaunch("https://www.facebook.com/");
	
}
}
