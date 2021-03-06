package Com.isha;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Donation_usd {
	private WebDriver driver;
	public String baseurl;
	@BeforeTest
	public void setup() throws Exception{
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
	

	public class donationINR {
		private WebDriver driver;
		public String baseurl;
		@BeforeTest
		
	public void start () throws Exception{
		 driver = new FirefoxDriver();
		 baseurl= "http://www.stag.ishavidhya.org/";
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	}
		public void Donation_INR1() {
			
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li"));
			action.moveToElement(we).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Actions action1 = new Actions(driver);
			WebElement we1 = driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li/ul/li[1]"));
			action1.moveToElement(we1).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li/ul/li[1]/ul/li[1]/a")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("price_20")).sendKeys("");
		    driver.findElement(By.name("price_10")).sendKeys("");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("price_11")).sendKeys("");
		    driver.findElement(By.name("price_12")).sendKeys("");
		    driver.findElement(By.name("price_13")).sendKeys("");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("price_14")).sendKeys("");
		    driver.findElement(By.name("price_15")).sendKeys("");
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		   

			driver.findElement(By.id("ishaOfflineRecur")).click();
			
			driver.findElement(By.xpath(".//*[@id='Main']/div[2]/div/fieldset/div/div[2]/label[1]")).click();

		
			driver.findElement(By.className("email required")).clear();
			driver.findElement(By.id("email-5")).sendKeys("");

			driver.findElement(By.id("confirmEmail")).clear();
			driver.findElement(By.id("confirmEmail")).sendKeys("");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select select_title = new Select (driver.findElement(By.id("custom_6")));
			select_title.selectByValue("Mister");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("first_name")).sendKeys("");	
			driver.findElement(By.id("last_name")).sendKeys("");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Select select_gender = new Select (driver.findElement(By.id("")));
			select_gender.selectByValue("Male");
		
			driver.findElement(By.id("custom_7")).sendKeys("");
			driver.findElement(By.id("")).sendKeys("");
			Select category = new Select (driver.findElement(By.id("custom_83")));
			category.selectByValue("Individual");
		
			driver.findElement(By.id("street_address-1")).sendKeys("");
			driver.findElement(By.id("city-1")).sendKeys("");
			driver.findElement(By.id("postal_code-1")).sendKeys("");
			Select cnty = new Select (driver.findElement(By.id("")));
			cnty.selectByValue("1003");
		
			Select stet = new Select (driver.findElement(By.id("street_address-1")));
			stet.selectByValue("1003");
			driver.findElement(By.xpath(".//*[@id='_qf_Main_upload-bottom']")).click();
	 }
	@Test 
	public void Donation_INR() {
		
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li"));
			action.moveToElement(we).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Actions action1 = new Actions(driver);
			WebElement we1 = driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li/ul/li[1]"));
			action1.moveToElement(we1).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='nice-menu-1']/li/ul/li[1]/ul/li[1]/a")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("price_20")).sendKeys("100");
		    driver.findElement(By.name("price_10")).sendKeys("2");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("price_11")).sendKeys("2");
		    driver.findElement(By.name("price_12")).sendKeys("2");
		    driver.findElement(By.name("price_13")).sendKeys("2");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("price_14")).sendKeys("200");
		    driver.findElement(By.name("price_15")).sendKeys("700");
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		   

			driver.findElement(By.id("ishaOfflineRecur")).click();
			
			driver.findElement(By.xpath(".//*[@id='Main']/div[2]/div/fieldset/div/div[2]/label[1]")).click();

		
			driver.findElement(By.className("email required")).clear();
			driver.findElement(By.id("email-5")).sendKeys("ashish@mailinator.com");

			driver.findElement(By.id("confirmEmail")).clear();
			driver.findElement(By.id("confirmEmail")).sendKeys("ashish@mailinator.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select select_title = new Select (driver.findElement(By.id("custom_6")));
			select_title.selectByValue("Mister");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("first_name")).sendKeys("Ashish");	
			driver.findElement(By.id("last_name")).sendKeys("Kumar");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Select select_gender = new Select (driver.findElement(By.id("custom_10")));
			select_gender.selectByValue("Male");
		
			driver.findElement(By.id("custom_7")).sendKeys("01452454523");
			driver.findElement(By.id("")).sendKeys("ashishkumar@mailinator.com");
			Select category = new Select (driver.findElement(By.id("custom_83")));
			category.selectByValue("Individual");
		
			driver.findElement(By.id("street_address-1")).sendKeys("vh no #980");
			driver.findElement(By.id("city-1")).sendKeys("Jandoor ");
			driver.findElement(By.id("postal_code-1")).sendKeys("5455454");
			Select cnty = new Select (driver.findElement(By.id("custom_83")));
			cnty.selectByValue("1003");
		
			Select stet = new Select (driver.findElement(By.id("street_address-1")));
			stet.selectByValue("1003");
			driver.findElement(By.xpath(".//*[@id='_qf_Main_upload-bottom']")).click();
	 }
	@AfterTest
	public void close() throws Exception{

	driver.close();
	}
	}
	
	
	
	
	
	
	
}
