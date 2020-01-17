package script_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homepage {
 WebDriver driver;
 
   @BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\maven\\Lib\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://hr.slingpe.com/");
	}
   
   @Test
   public void LoginpageTest() {
	   WebElement username = driver.findElement(By.xpath("//input[@placeholder='Mobile']"));
	   username.sendKeys("3333333333");
	   WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	   password.sendKeys("123456");
	   WebElement button = driver.findElement(By.className("btn btn-primary sign  login"));
	   button.click();
   }
   
   @AfterSuite
   public void tearDown() {
	   driver.quit();
   }
   
	
}
