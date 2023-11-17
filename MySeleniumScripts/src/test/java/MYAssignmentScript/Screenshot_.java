package MYAssignmentScript;

 

		
	import java.io.File;
		import java.io.IOException;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Screenshot_ {

			public static void main(String[] args) throws IOException {

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.get("https://www.makemytrip.in/");

				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				// Create a file at the destination and store the screenshot there.
				// ./ to take current project folder structure

				File destFile = new File("C:\\Users\\master\\Documents\\Screenshots");

				FileUtils.copyFile(srcFile, destFile);

				driver.close();

			}

	 

		 

}
