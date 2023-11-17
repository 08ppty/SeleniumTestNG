package MYAssignmentScript;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazonn {

	public static void main(String[] args) {

		 

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

	 

		driver.get("https://www.amazon.in");
		
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	 
//
		driver.findElement(By.id("ap_email")).sendKeys("pranganayaki1960@gmail.com");

		WebElement password = driver.findElement(By.id("ap_password"));

//		displayed = password.isDisplayed();
//		System.out.println("Element-password is Displayed ?" + displayed);
//
//		enabled = password.isEnabled();
//		System.out.println("Element-password is Enabled ?" + enabled);
		WebElement username=driver.findElement(By.id("ap_email"));
		 
	   

		WebElement button = driver.findElement(By.id("continue"));
		button.click();
	}}
		
 
//
//	}

