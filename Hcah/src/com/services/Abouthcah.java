package com.services;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Abouthcah {
	private WebDriver driver;
	  public String baseurl;
	  @Before
	  public void start(String browser)throws Exception {
	 driver = new FirefoxDriver();
	   baseurl= "http://stag.hcah.srijan-sites.com";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	  }
	  
	  @Test
	  public void about_hcah() throws Exception {
		 
		driver.get(baseurl + "/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("About HCAH")).click();
	    Thread.sleep(20000);
	  }
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	  }
	  
	  
	}
