package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//Print the url of the header image to the console
public class headerURL_02 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://hrm.alchemy.hguy.co/");
		WebElement headerImage = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		String imageUrl = headerImage.getAttribute("src");
		System.out.println(imageUrl);
		driver.quit();
		
	}
}