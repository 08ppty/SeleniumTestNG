package MYAssignmentScript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.xdevapi.Statement;

public class JDBCSELENIUMm {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
	       WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.makemytrip.com");
			
			String title = driver.getTitle();
			
			String url = driver.getCurrentUrl();
			
			 
			
			
			
		
			
		    

		         Class.forName("com.mysql.cj.jdbc.Driver");

		        String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		        String user = "Doketc";
		        String password ="SHepPe__1E";
		        
		        Connection conn = DriverManager.getConnection(dburl,user,password);
//		        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumtest/?user="Doketc"&password="SHepPe_1E"")
//		  
		        System.out.println("Successfully connected to the database");
		        String query = "CREATE TABLE webtest(Pagetitle VARCHAR(50) NOT NULL ,pageURL VARCHAR(100) NOT NULL)";
		        String query1 = "select * from webtest";
		     

		        
		    	PreparedStatement ps = conn.prepareStatement("insert into webtest values(?,?)"); // execute query
				ps.setString(1,title);
				ps.setString(2,url);
				ps.executeUpdate();
				
				driver.navigate().to("https://github.com/");
				
				
				title= driver.getTitle();
				
				url = driver.getCurrentUrl();
				conn.close();
				

		}}
			
			
			
			
			
		 

//			// Updated code
//
//					// Clear the source text box
//					
//					driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
//				
//				// enter input string in text box
//					
//				driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("Paris");
//							
//						 
//							// capture element form the list
//					driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-src']/descendant::li[3]")).click();
//							
//							// destination
//					driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
//					
//					driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("London");
//						
//				 
//					
//					driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']/descendant::li[3]")).click();
//						
//					//calander
//					
//				 
//					driver.findElement(By.id("date-box")).click();
//					
//				 
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			   driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
//			   driver.findElement(By.id("username")).sendKeys("6362379582");
//			  
//driver.findElement(By.xpath("//span[@class='\"capText font16\\']")).click();
//	 
////			
//			String dburl = "jdbc:mysql://127.0.0.1:3306/seleniumtest";
//			String username = "root";
//			String password = "SHepPe__1E";
//			
//	         Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection con = DriverManager.getConnection(dburl,username,password);
//			PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
//			ps.setString(1,title);
//			ps.setString(2,url);
//			ps.executeUpdate();
//			
//			
//			driver.navigate().to("https://github.com/");
//			
//			
//			title= driver.getTitle();
//			
//			url = driver.getCurrentUrl();
//			
//			ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
//			ps.setString(1,title);
//			ps.setString(2,url);
//			ps.executeUpdate();
//			
//			
//			con.close();
//	
	

