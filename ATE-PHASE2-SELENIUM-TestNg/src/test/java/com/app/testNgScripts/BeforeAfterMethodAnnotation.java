package com.app.testNgScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotation {

	 
		// TODO Auto-generated method stub
WebDriver driver;


		
		@BeforeMethod
	public void login () {
		System.out.println("open the browser");
		System.out.println("login to the gmail");
		
	}
	
	@Test(priority = '2')
	public void ComposeEmail() {
		
		
		System.out.println("Steps to compose the email");
		
		
	}
	
	@Test (priority= '3')
	
	public void SearchEmail () {
		
		
			System.out.println("Steps to search the email");
	}
	
	
	@Test (priority ='4')
	public void 	DeleteEmail () {
		
		
		System.out.println("Steps to delelet the email");
		
	}
	
	
@AfterMethod
	
	public void logout() {
		
		
		System.out.println("Logout from the  gmail");
		
		
		System.out.println("close the browser");
		
		
	}

}
