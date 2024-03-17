package BsicPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) {

       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/downloads/");
              
     List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
     
     int count =allLinks.size();
     
     System.out.println("Link Count is"+ count);
     
     WebElement link = allLinks.get(0);
     
     String text = link.getText();
     
     System.out.println(text);
              
              
              
              
              
              
              
             
	}

}
