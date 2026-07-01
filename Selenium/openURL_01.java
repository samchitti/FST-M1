package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openURL_01 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://hrm.alchemy.hguy.co/symfony/web/index.php/admin/viewAdminModule");
	System.out.println("Page title is:"+ driver.getTitle());
		driver.quit();

	}

}
