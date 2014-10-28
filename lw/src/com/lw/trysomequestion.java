package com.lw;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class trysomequestion {
	
	private WebDriver driver;
	public String baseurl;
	 
@Before
@Parameters("browser")
public void start () throws Exception{
	 driver = new FirefoxDriver();
	 baseurl= "http://dev.lw.srijan-sites.com";
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
}
 @Test 
 public void TSQ() throws InterruptedException{
		driver.get(baseurl + "/");
		driver.findElement(By.linkText("Try some Questions")).click();
		Select selectclass = new Select (driver.findElement(By.name("select_class")));
		selectclass.selectByValue("137");
		// Select selectsub= new Select (driver.findElement(By.cssSelector("#modalBackdrop")));
		// selectsub.selectByValue("137");
	    driver.findElement(By.id("edit-submit-button")).click();
  }
@After
public void close() throws Exception{

driver.close();
}
}
 