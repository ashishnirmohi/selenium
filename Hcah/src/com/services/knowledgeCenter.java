package com.services;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
public class knowledgeCenter {
	private WebDriver driver;
	public String baseurl;
	
	@Before
	@Parameters
	public void start () throws Exception{
	 driver = new FirefoxDriver();
	 baseurl= "http://stag.hcah.srijan-sites.com";
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	}
	@Test 
	public void knowledge_enter() throws InterruptedException{
	driver.get(baseurl + "/");
	driver.findElement(By.linkText("KNOWLEDGE CENTER")).click();
	driver.findElement(By.xpath(".//*[@id='block-system-main']/div/div/div[4]/div[5]/span/a")).click();
	driver.findElement(By.linkText("KNOWLEDGE CENTER")).click();
	driver.findElement(By.xpath(".//*[@id='block-views-35874fddbc2104cd090e545f2b618d97']/div/div/div[2]/div/span/a")).click();
	}
	
	
	@After
	public void stop() throws Exception{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
}
