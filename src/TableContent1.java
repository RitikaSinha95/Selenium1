

import java.util.List;

import org.openqa.selenium.By; import 
org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableContent1 {

	public static void main(String[] args) {	
     WebDriver driver = new ChromeDriver();
     
    driver.get("file:///C:/Users/Ritika/Desktop/Demo.HTML");
    
       List<WebElement> checkboxes= driver.findElements(By.xpath("//td"));
       
       int count = checkboxes.size();
       
       for(int i=0;i<count; count++)
       {
    	   WebElement cell= checkboxes.get(i);
    	   String text = cell.getText(); 
    	   System.out.println(text);
       }
	}

}
