package MYAssignmentScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class signinautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email")).sendKeys("pranganayaki1960@gmail.com");

		WebElement password = driver.findElement(By.id("ap_password"));
		 
		WebElement username=driver.findElement(By.id("ap_email"));
		 
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		WebElement button = driver.findElement(By.id("continue"));
		WebElement web2 = driver.findElement(By.xpath("//*[@id=\'continue\']"));
		 
		Actions act = new Actions(driver);
		act.doubleClick(web2).perform();
	  
	
		 
		
		
		
	}

}
