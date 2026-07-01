package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applyleave_08 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://hrm.alchemy.hguy.co/");  		
		
		driver.findElement(By.id("txtUsername")).sendKeys("orange"); 
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch"); 
        driver.findElement(By.id("btnLogin")).click();
                
        driver.findElement(By.xpath("//span[text()='Apply Leave']/parent::a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select leaveType = new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
        leaveType.selectByVisibleText("Holiday");
        driver.findElement(By.id("applyleave_txtFromDate")).clear();        
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2026-07-25");
        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2026-07-25");
        //driver.findElement(By.id("applyleave_txtComment")).sendKeys("Sick Leave");
        driver.findElement(By.id("applyBtn")).click();
        driver.close();

	}
}
