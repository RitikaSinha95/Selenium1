package BsicPractice1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseOperations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement option= driver.findElement(By.xpath("//span[text()='Account & Lists']"));	
		WebElement option1=	 driver.findElement(By.xpath("//span[text()='Your Orders']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(option).moveToElement(option1).perform().click();
		
		
		
	         
		
		
		  

	}

}
