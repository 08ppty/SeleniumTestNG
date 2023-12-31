package com.app.TestNG.extentreports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
	
	
	@Test(testName="TestWiki")
	public void method1() {
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		String expectedtitle = "Create account - Wekipedia";
		
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle,"The title of the page is not valid");
		
		extentTest.pass("Assertion is passed");
	}
	@Test(testName="Testfacebook")
	public void method2() {
		
		//input#email
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin@gmail.com");
		extentTest.info("Enter valid URL");
	}

}

