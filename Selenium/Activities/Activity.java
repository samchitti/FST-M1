package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Activity {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();  //Creating a new instance for Edge Driver
        
        driver.get("https://training-support.net"); //To open the browser

        System.out.println("Page title is: " + driver.getTitle()); //Printing text by fetching the title of the current page
 
        driver.findElement(By.linkText("About Us")).click(); //By using webElement command we are interacting with web element
 
        System.out.println("New page title is: " + driver.getTitle());//Printing text by fetching the title of the current page

        driver.quit(); //Closes all browsing tabs
    }
}
