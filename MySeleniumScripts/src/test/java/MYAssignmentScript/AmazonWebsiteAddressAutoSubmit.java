package MYAssignmentScript;

import java.util.List; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 

import io.github.bonigarcia.wdm.WebDriverManager; 

public class AmazonWebsiteAddressAutoSubmit { 

	public static void main(String[] args) { 
		ChromeOptions chromeOptions = new ChromeOptions(); 
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(chromeOptions); 

	 

		// Launch the Online Store Website 
	
			driver.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_post"); 

			LoginPage login = new LoginPage(driver); 
			
			// Replace with your emailId 
			login.set_username("tltxxx@gmail.com"); 
			login.continueButtonClick(); 

			// Replace with your password 
			login.set_password("xxxx"); 
			login.click_button(); 

		 
			 

			// Edit address part 
			Thread.sleep(5000); 
			
			// We can check whether address 
			// got added successfully 
			driver.get("https://www.amazon.in/a/addresses"); 

			Thread.sleep(5000); 
			
			// Print a Log In message to the screen 
			System.out.println("Successfully performed the operation of adding address"); 

			Thread.sleep(5000); 
		 

		// Close the driver 
		driver.quit(); 
	 
	} 

} 
 

 
