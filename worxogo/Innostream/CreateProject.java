package Innostream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CreateProject {
WebDriver driver;
	
	@Test
	public void AccountAdminlogin(){
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");	
		 driver.findElement(By.id("edit-name")).sendKeys("AshishPlatformAdmin");
		 driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.className("humberger")).click();
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[2]/nav/ul/li/ul/li[2]/a")).click();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.id("wg-accordion-arrow-1085")).sendKeys(Keys.ENTER);
}
	
	}

