package BsicPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

       public class PrintLink {

	  public static void main(String[] args) {
		
		   ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.selenium.dev/downloads/");
		  
		  List<WebElement> url = driver.findElements(By.xpath("//a"));
		  
		  for(WebElement all : url)
			  
		  {
			   String value = all.getAttribute("href");
			   
			   System.out.println(value);
		  }
		  
		  

	}

}
