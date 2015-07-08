import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class TwoInOneRegExcelonz {
	public WebDriver driver;
@BeforeTest
public void TwoInOne(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}

public void TwoInOne1(){
	driver.get("http://staging-lw.gailabs.com");
	driver.findElement(By.linkText("Pricing")).click();
	driver.findElement(By.id("edit-submit")).click();
	driver.findElement(By.xpath(".//*[@id='messages-inner']/table/tbody/tr[2]/td[2]/div[2]/a")).click();
	driver.findElement(By.id("edit-field-first-name-und-0-value")).sendKeys("AshishKumar");
	driver.findElement(By.id("edit-field-last-name-und-0-value")).sendKeys("Singh");
	driver.findElement(By.id("edit-mail")).sendKeys("ashish.nirmohi@gmail.com");
	driver.findElement(By.id("edit-field-mobile-no-und-0-value")).sendKeys("8894392548");
	driver.findElement(By.id("edit-pass-pass1")).sendKeys("test123");
	driver.findElement(By.id("edit-pass-pass2")).sendKeys("test123");
	driver.findElement(By.id("autocomplete-deluxe-input--3")).sendKeys("India");
	driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys("Kangra");
	driver.findElement(By.id("edit-child-first-name")).sendKeys("Nadish");
	driver.findElement(By.id("edit-child-last-name")).sendKeys("Kumar");
	driver.findElement(By.xpath(".//*[@id='edit-childs-date-of-birth-datepicker-popup-0']")).sendKeys("7/04/2000");
	//driver.findElement(By.xpath(".//*[@id='edit-class-and-section-hierarchical-select-selects-0']")).click();
	
    Select clas = new Select(driver.findElement(By.xpath(".//*[@id='edit-class-and-section-hierarchical-select-selects-0']")));
    try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    clas.selectByIndex(5);
    
    try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath(".//*[@id='edit-class-and-section-hierarchical-select-dropbox-add']")).click();
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.findElement(By.id("edit-child-conf-password-pass1")).sendKeys("123123");
	driver.findElement(By.id("edit-child-conf-password-pass2")).sendKeys("123123");	
	driver.findElement(By.id("edit-child-name-of-school")).sendKeys("Dav School");
	driver.findElement(By.xpath(".//*[@id='edit-child-school-city']")).sendKeys("Kangra");
	driver.findElement(By.xpath(".//*[@id='edit-termandcondetion']")).click();
	driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
}
@AfterTest
public void TwoInOne2(){
driver.quit();
}

}
