package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sendkeys {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  
		  driver.findElement(By.name("q")).sendKeys("Sendkeys Method in Selenium");//Sendkeys method is used for 
		  // enter the text in text box only.
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("q")).clear();//Clear method is used for clear the text from text box only.
    }
}