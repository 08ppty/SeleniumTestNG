package MYAssignmentScript;

 



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonassignment{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		driver.get("https://www.amazon.in");
		WebElement username=driver.findElement(By.id("ap_email"));
		WebElement password=driver.findElement(By.id("ap_password"));
		WebElement login=driver.findElement(By.name("commit"));

		username.sendKeys("pranganayaki1960@gmail.com");
		password.sendKeys("Qwerty123_");
		login.click();
		
		
		


	 
	 


<p>Actions action = new Actions(driver);</p>



<p>action.sendKeys(Keys.PAGE_DOWN).build().perform();</p>


	       
	       driver.close();
	  
	


		Thread.sleep(5000);

		driver.close();
	}

}

