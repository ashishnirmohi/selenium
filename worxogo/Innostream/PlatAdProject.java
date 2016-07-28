package Innostream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class PlatAdProject{
	WebDriver driver;
	
	@Test
	public void PlatformAdminProjectCreation() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://worxogo-innoxogo.gailabs.com/");
		driver.findElement(By.id("edit-name")).sendKeys("AshishPlatformAdmin");
		driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		driver.findElement(By.id("edit-submit")).click();
		 
		driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/ul/li[1]/a")).click();
		 driver.findElement(By.id("edit-title")).sendKeys("Test Innovision");
		 driver.findElement(By.id("edit-body-und-0-value")).sendKeys("Test Innovision Description");
		 driver.findElement(By.id("edit-field-innovision-message-und-0-value")).sendKeys("Test Innovision Message");
		 driver.findElement(By.className("autocomplete-deluxe-container")).click();
		 driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys("Airtel");
		 driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys("Airtel-IT");
		 driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys(Keys.ENTER);
		 //driver.findElement(By.xpath("//html")).click();
		 
		 driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys(Keys.TAB);
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys("Awareness");
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys("Batch House");
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys(Keys.ENTER);
		 driver.findElement(By.id("edit-submit")).click();
		 
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/a")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/ul/li[2]/a")).click();
		 
		 driver.findElement(By.id("edit-title")).sendKeys("Test Innogen");
		 driver.findElement(By.id("edit-body-und-0-value")).sendKeys("Test Innogen description");
		 driver.findElement(By.xpath(".//*[@id='edit-field-reference-und-0-nid']")).sendKeys("Test Innovision");
		 driver.findElement(By.xpath(".//*[@id='edit-field-reference-und-0-nid']")).sendKeys(Keys.TAB);
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys("TestTag");
		 driver.findElement(By.id("autocomplete-deluxe-input")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value-datepicker-popup-0']")).clear();
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value-datepicker-popup-0']")).sendKeys("06/22/2016");
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value2-datepicker-popup-0']")).clear();
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value2-datepicker-popup-0']")).sendKeys("06/28/2016");
		 
		 driver.findElement(By.id("edit-submit")).click();
		 
		 driver.findElement(By.id("edit-field-idea-description-und-0-value--2")).sendKeys("Test Innogen idea1");
		 driver.findElement(By.id("edit-submit--2")).click();
		
		 driver.findElement(By.id("edit-comment-body-und-0-value--2")).sendKeys("Test comment on idea1");
		 driver.findElement(By.id("edit-submit--4")).click();
		 driver.findElement(By.linkText("Platform")).click();
		 driver.findElement(By.linkText("Platform Content")).click();
		 Select newselect= new Select(driver.findElement(By.id("edit-type")));
		 newselect.selectByVisibleText("Innogen");
		 driver.findElement(By.id("edit-submit-administer-platform-content")).click();
		 driver.findElement(By.linkText("edit")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value-datepicker-popup-0']")).clear();
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value-datepicker-popup-0']")).sendKeys("06/21/2016");
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value2-datepicker-popup-0']")).clear();
		 driver.findElement(By.xpath(".//*[@id='edit-field-date-und-0-value2-datepicker-popup-0']")).sendKeys("06/22/2016");
		 driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		 driver.findElement(By.className("humberger")).click();	
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[2]/nav/ul/li/ul/li[1]/a")).click();
		 driver.findElement(By.linkText("Test Innogen description")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-add-innostream-btn']")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-inno-title']")).sendKeys("Test Innostream");
		 driver.findElement(By.xpath(".//*[@id='wg-new-innogen']/div/div/div[2]/input")).click();
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		/*
		 driver.findElement(By.xpath("ui-sortable")).click();
		 WebElement dragme = driver.findElement(By.className("ui-sortable"));
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 WebElement dropme = driver.findElement(By.className("wg-innostream-blk-wrapper"));
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Actions builder = new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 builder.clickAndHold(dragme).moveToElement(dropme).release(dragme).build().perform();
		 //	builder.dragAndDrop(dragme, dropme).build().perform();
		 Thread.sleep(8000); */
		 
		 
	}
}