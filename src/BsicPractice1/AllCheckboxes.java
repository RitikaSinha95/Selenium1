package BsicPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckboxes {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		  driver.get("file:///C:/Users/Ritika/Desktop/text.html");
		  
		  List <WebElement> checkboxes = driver.findElements(By.xpath("//input"));
		  
		  int count = checkboxes.size();
		  
		  System.out.println("The Size of Count is"+ count);
		  
		//  for(int i=0 ; i<=count; i++)
			  
		  {
			  WebElement checkbox = checkboxes.get(i);
			  checkbox.click();
			  
			  for(int j=count-1; j>=0; i--)
			  {
				  checkboxes.get(j).click(); 
			  }
			  
			  
		  }
		  
		  
		  

	}

}
