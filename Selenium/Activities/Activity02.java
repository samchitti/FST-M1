//Sending Input

package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity02 {

		public static void main(String[] args) {
	       
	        WebDriver driver = new EdgeDriver();

	        driver.get("https://training-support.net/webelements/login-form"); //Open a new browser
	        
	        System.out.println("Page title: " + driver.getTitle()); //Get the title of the page and print it to the console.
	       
	        driver.findElement(By.id("username")).sendKeys("admin"); //Find the username field using any locator and enter "admin" into it.
	        
	        driver.findElement(By.id("password")).sendKeys("password"); //Find the password field using any locator and enter "password" into it.	        
	       
	        driver.findElement(By.xpath("//button[text()='Submit']")).click(); //Find the "Log in" button using any locator and click it.

	        // Print the confirmation message
	        String message = driver.findElement(By.tagName("h1")).getText();
	        System.out.println(message);

	        // Close the browser
	        //driver.quit();
	    }
	}
