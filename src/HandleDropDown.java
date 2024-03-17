import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Ritika/Desktop/DEMO7.HTML");
		WebElement listbox = driver.findElement(By.name("Country"));
		Select select = new Select(listbox);
		Boolean v = select.isMultiple();
		System.out.println(v);
	    select.selectByVisibleText("United Kingdom"); 
		select.selectByIndex(3);
		select.selectByValue("USD");
		select.deselectByIndex(3);

	}

}
