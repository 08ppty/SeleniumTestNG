package MYAssignmentScript;

import java.time.Duration;
import java.util.NoSuchElementException;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
	
		
		
		FluentWait wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(10))
			          .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			          WebElement element = wait.until(new Function<WebDriver, WebElement>() 


			     {
			   public WebElement apply(WebDriver driver) {
			   WebElement element = driver.findElement(By.xpath(""""));
			   return element;
			   }
			     });"// TODO Auto-generated method stub

	}

}
