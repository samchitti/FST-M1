package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Directory_06 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://hrm.alchemy.hguy.co/");  		
		
		
        driver.findElement(By.id("txtUsername")).sendKeys("orange"); 
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch"); 
        driver.findElement(By.id("btnLogin")).click();
        
        driver.findElement(By.id("menu_directory_viewDirectory")).click();
        //driver.quit();
       
	}
}