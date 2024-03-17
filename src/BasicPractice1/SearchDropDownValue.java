package BasicPractice1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchDropDownValue {

	     public static void main(String[] args) {
	    	 System.out.println("User Enter Search Value"); 	
	    	 Scanner sc = new Scanner(System.in); 
	    	 String ex = sc.next();
	    	 int found =0;
	    	  System.out.println("Searching-----"); 	
		      ChromeDriver driver = new ChromeDriver();
		  driver.get("file:///C:/Users/Ritika/Desktop/DEMO7.HTML");
		  WebElement list = driver.findElement(By.name("Country")); 
		  Select s = new Select(list);
		  
		  List<WebElement> allOptions = s.getOptions();
		  for(WebElement option : allOptions)
		  {
			  String text = option.getText();
			  
			  if(text.equals(ex))
			  {
				   found++;
			  }
		  }
		 
		 
		 if(found==0) 
		 {
			 System.out.println("No Matching String is found");
		 }
		  
		 else if(found==1)
		 {
			 System.out.println("Matching String is found");
		 }
		 
		 else
		 {
			 System.out.println("Duplicate String is found");
		 }
	}

}
