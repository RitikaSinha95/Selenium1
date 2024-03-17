import java.util.List;

import org.openqa.selenium.By; import 
org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Ritika/Desktop/Demo.HTML");
		
		List<WebElement> allCells = driver.findElements(By.xpath("//td[3]"));
		
		int count=allCells.size();
		for(int i=0;i<count;i++)
		{
		WebElement cell = allCells.get(i);
		
		String text = cell.getText();
		
		System.out.println(text);

	}

}
	
}
