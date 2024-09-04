package demo_testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class fblogin {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
	   WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("rakenth");
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("12345");
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Jai\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Jai\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.facebook.com/");
	   WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("rakenth");
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("12345");
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    driver.close();
	  
	  
	  
	  
  
  }


}
