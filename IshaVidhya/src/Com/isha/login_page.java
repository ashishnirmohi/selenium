package Com.isha;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_page {
	  private WebDriver driver;
	  private String baseUrl;
@Before
public void start() {
	driver = new FirefoxDriver();
    //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver");
    //WebDriver driver = new ChromeDriver();
    baseUrl = " http://www.stag.ishavidhya.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
@Test

public void loginpage1(){
	driver.get(baseUrl);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("edit-name")).sendKeys("");
	driver.findElement(By.id("edit-pass")).sendKeys("");
	driver.findElement(By.id("edit-submit")).click();
}
@Test

public void loginpage2(){
	driver.get(baseUrl);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("edit-name")).sendKeys("ashish_nirmohi");
	driver.findElement(By.id("edit-pass")).sendKeys("test123");
	driver.findElement(By.id("edit-submit")).click();
}


@After
public void stop(){
	
}
}
