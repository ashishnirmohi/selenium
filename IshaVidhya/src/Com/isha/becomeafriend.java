package Com.isha;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class becomeafriend {
	private WebDriver driver;
	public String baseurl;

@Before
@Parameters
public void start () throws Exception{
 driver = new FirefoxDriver();
 baseurl= "http://www.stag.ishavidhya.org";
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 driver.manage().window().maximize();
}
@Test 
public void become_friend1() throws InterruptedException{
driver.get(baseurl + "/");
driver.findElement(By.xpath(".//*[@id='block-block-6']/div/div/div[2]/input")).click();
driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
}
@Test 
public void become_friend2() throws InterruptedException{
driver.get(baseurl + "/");
driver.findElement(By.xpath(".//*[@id='block-block-6']/div/div/div[2]/input")).click();
Select title = new Select(driver.findElement(By.id("edit-submitted-title")));
title.selectByValue("Mister");
driver.findElement(By.id("edit-submitted-first-name")).sendKeys("Ashish");
driver.findElement(By.id("edit-submitted-middle-name")).sendKeys("Kumar");
driver.findElement(By.id("edit-submitted-last-name")).sendKeys("Dhiman");
driver.findElement(By.xpath(".//*[@id='edit-submitted-contact-no']")).sendKeys("08885474747");
driver.findElement(By.id("edit-submitted-gender-1")).click();
driver.findElement(By.id("edit-submitted-email-id")).sendKeys("ashish@mailinator.com");
driver.findElement(By.id("edit-submitted-city-of-residence")).sendKeys("Test #23");
driver.findElement(By.id("edit-submitted-state")).sendKeys("Himachal Pardesh");
driver.findElement(By.id("edit-submitted-country")).sendKeys("India");
driver.findElement(By.xpath(".//*[@id='edit-submitted-area-of-interest-and-fundraising-wrapper-fundraising-champion-the-cause-of-isha-vidhya-1']")).click();
driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();

}
@After
public void stop() throws Exception{
	Thread.sleep(2000);
	driver.close();
}




}