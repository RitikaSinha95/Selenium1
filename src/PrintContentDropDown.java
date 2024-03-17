import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContentDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ritika/Desktop/DEMO7.HTML");
		WebElement listbox = driver.findElement(By.name("Country"));
		Select select = new Select(listbox);
		
		List<WebElement> getOptions=select.getOptions();
		
		for(WebElement option:getOptions)
			
		{
			String text=option.getText();
			System.out.println(text);
			
		}

	}

}
