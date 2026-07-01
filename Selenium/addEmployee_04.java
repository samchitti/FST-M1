package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addEmployee_04 {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.get("https://hrm.alchemy.hguy.co/");  		
			
			
	        driver.findElement(By.id("txtUsername")).sendKeys("orange"); 
	        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch"); 
	        driver.findElement(By.id("btnLogin")).click();
	        
	        driver.findElement(By.id("menu_pim_viewPimModule")).click();
	        
	        driver.findElement(By.id("btnAdd")).click();
	        
	        driver.findElement(By.name("firstName")).sendKeys("SHIVA");
	        driver.findElement(By.name("lastName")).sendKeys("KUMAR");   
	        driver.findElement(By.id("btnSave")).click();
	        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("SHIVA");
	        
	        driver.findElement(By.id("searchBtn")).click();
	        
	        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	        //driver.quit();
	 
		}

	}

