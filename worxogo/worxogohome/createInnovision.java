package worxogohome;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class createInnovision {
WebDriver driver;
	
	@Test
	public void createinnovision() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");
		 driver.findElement(By.id("edit-name")).sendKeys("RaghavBhavser");
		 driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/a")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[3]/ul/li[1]/a")).click();
		 driver.findElement(By.id("edit-title")).sendKeys("Test Innovision");
		 driver.findElement(By.id("edit-body-und-0-value")).sendKeys("Test Innovision Description");
		 driver.findElement(By.id("edit-field-innovision-message-und-0-value")).sendKeys("Test Innovision Message");
		 Thread.sleep(5000);
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
		
	}
}