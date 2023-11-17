package MYAssignmentScript;



	import java.io.IOException;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
 





	public class AmzaonAsignment {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			
			// Code for removing push notification:
			//Create a class to handle external elements.  (Alerts)
		 
		 
			
	WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.amazon.in");
			driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			
				
		driver.findElement(By.id("ap_email")).sendKeys("pranganayaki1960@gmail.com");
		 
					
					Thread.sleep(5000);
					// capture element form the list
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Qwerty123_");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
			driver.findElement(By.id("add-to-wishlist-button-submit")).click();		
           
			
			
			
		}

	}
