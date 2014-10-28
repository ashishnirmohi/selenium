package com.services;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class homecardiaccare {
	

	
	  private WebDriver driver;
	  public String baseurl;
	  @Before
	public void start()throws Exception {
		
	 driver = new FirefoxDriver();
	 baseurl= "http://stag.hcah.srijan-sites.com";
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	}
	  @Test
	  public void testcardiacCare() throws Exception {
		 
		driver.get(baseurl + "/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div[2]/div/div[3]/span/div/div/div/div[1]/div/a")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'SEE DETAILS')])[7]")).click();
	    
	    driver.findElement(By.id("edit-submitted-your-name")).sendKeys("Ashish");
	   
	    driver.findElement(By.id("edit-submitted-contact-number")).sendKeys("91 8895475474");
	    
	    driver.findElement(By.id("edit-submitted-email-id")).sendKeys("ashish@mailinator.com");
	  
	    driver.findElement(By.id("edit-submitted-message")).sendKeys("Test Message");
	    Thread.sleep(20000);
	    driver.findElement(By.name("op")).click();
	   
	   
	    
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	  }
	  	}



