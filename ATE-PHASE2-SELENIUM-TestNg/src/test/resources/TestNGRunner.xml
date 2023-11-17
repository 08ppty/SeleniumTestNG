package com.app.testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {

	
	
	
	@BeforeMethod
	public void BLogin() {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title =driver.getTitle();
		System.out.println(title);
		 driver.close();
		
		
		
		
		
		
	}
	@Test
	public void CLoginWithValidCreentials() {
		
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize()	;
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("demouser1@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.close();
	
	}
	
	
	@Test
	
	public void AlogoutFromApplication() {
		WebDriver driver = new ChromeDriver()	;
	     driver.manage().window().maximize();
	     driver.get("https://tutorialsninja.com/demo/");
	     driver.findElement(By.linkText("My Account")).click();
	 	driver.findElement(By.linkText("Login")).click();
	 	driver.findElement(By.id("input-email")).sendKeys("demouser1@gmail1.com");
	 	driver.findElement(By.id("input-password")).sendKeys("12345");
	 	driver.findElement(By.xpath("//input[@value='Login']")).click();
	 	driver.findElement(By.linkText("My Account ")).click();
	 	driver.findElement(By.linkText("Logout")).click();
	 	
	 	driver.close();
	
	}
	
	
	
}
