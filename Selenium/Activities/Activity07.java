//Check if elements are enabled

package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity07 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the text field
        WebElement textbox = driver.findElement(By.id("textInput"));
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        // Click the toggle button to enable it
        driver.findElement(By.id("textInputButton")).click();
        // Check if the text field is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        // Type something in to it
        textbox.sendKeys("Hi Baby!");
        System.out.println(textbox.getDomProperty("value"));

        // Close the browser
        driver.quit();
    }
}