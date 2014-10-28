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

public class signup_page {
	private WebDriver driver;
	public String baseurl;
	
	@Before
	@Parameters
public void start () throws Exception{
	 driver = new FirefoxDriver();
	 baseurl= "http://staging.isha.srijan-sites.com";
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
}
	@Test 
	public void Sign_up_page1() throws InterruptedException{
	driver.get(baseurl + "/");
	driver.findElement(By.xpath(".//*[@id='block-block-9']/div/div/div/div[1]/a")).click();
	driver.findElement(By.id("edit-mail")).clear();
	driver.findElement(By.id("edit-mail")).sendKeys("ashish@mailinator.com");
	driver.findElement(By.id("edit-submit")).click();

}
	@Test  
	public void Sign_up_page2() throws InterruptedException{
		driver.get(baseurl + "/");
		driver.findElement(By.xpath(".//*[@id='block-block-9']/div/div/div/div[1]/a")).click();
		driver.findElement(By.id("edit-mail")).clear();
		driver.findElement(By.id("edit-mail")).sendKeys("ashish@mailinator.com");
		driver.findElement(By.id("edit-conf-mail")).sendKeys("ashish1@mailinator.com");
		driver.findElement(By.id("edit-pass-pass1")).sendKeys("test123");
		driver.findElement(By.id("edit-pass-pass2")).sendKeys("test1234");
		driver.findElement(By.id("edit-submit")).click();
	}
	
	@Test 
	public void Sign_up_page3() throws InterruptedException{
		driver.get(baseurl + "/");
		driver.findElement(By.xpath(".//*[@id='block-block-9']/div/div/div/div[1]/a")).click();
				
		driver.findElement(By.id("edit-mail")).sendKeys("ashish@mailinator.com");
		driver.findElement(By.id("edit-conf-mail")).sendKeys("ashish@mailinator.com");
		driver.findElement(By.id("edit-pass-pass1")).sendKeys("test123");
		driver.findElement(By.id("edit-pass-pass2")).sendKeys("test123");
		
		Select title = new Select (driver.findElement(By.id("custom_6")));
		title.selectByValue("Mister");
		
		driver.findElement(By.id("custom_7")).sendKeys("01456454554");
		driver.findElement(By.id("CIVICRM_QFID_Government_Agency_6")).click();
		driver.findElement(By.id("edit-submit")).click();
		
	}
	   @Test 
	public void Sign_up_page4() throws InterruptedException{
	driver.get(baseurl + "/");
	driver.findElement(By.xpath(".//*[@id='block-block-9']/div/div/div/div[1]/a")).click();
	
	driver.findElement(By.id("edit-mail")).sendKeys("ashish@mailinator.com");
	driver.findElement(By.id("edit-conf-mail")).sendKeys("ashish@mailinator.com");
	
	driver.findElement(By.id("edit-pass-pass1")).sendKeys("test123");
	driver.findElement(By.id("edit-pass-pass2")).sendKeys("test123");
	
	Select title = new Select (driver.findElement(By.id("custom_6")));
	title.selectByValue("Mister");
	
	driver.findElement(By.id("first_name")).sendKeys("Ashish");
	driver.findElement(By.id("last_name")).sendKeys("Kumar");
	driver.findElement(By.id("custom_7")).sendKeys("01456454554");
	driver.findElement(By.id("custom_9")).sendKeys("ashishkumar@mailinator.com");
	driver.findElement(By.id("CIVICRM_QFID_Government_Agency_6")).click();
	driver.findElement(By.id("edit-submit")).click();
	driver.findElement(By.id("street_address-1")).sendKeys("Test 123");
	driver.findElement(By.id("city-1")).sendKeys("Test_$%@123");
	driver.findElement(By.id("postal_code-1")).sendKeys("455555545");
	Select cnty = new Select (driver.findElement(By.id("country-1")));
	cnty.selectByValue("1001");
	Select st = new Select (driver.findElement(By.id("state_province-1")));
	st.selectByValue("1508");
	driver.findElement(By.id("edit-submit")).click();
		}
	
	@After
	public void close() throws Exception{

	driver.close();
	      }
	   }
