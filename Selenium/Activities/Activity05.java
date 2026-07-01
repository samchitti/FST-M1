package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity05 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        
        System.out.println("Page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        // Find the toggle button and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the button again
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        // Close the browser
        driver.quit();
    }
}