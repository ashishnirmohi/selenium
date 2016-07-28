package worxogohome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PlatformAdmin {
	WebDriver driver;
	
	@Test
	public void createAccount(){
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");	
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.id("edit-name")).sendKeys("RaghavBhavser");
		 driver.findElement(By.id("edit-mail")).sendKeys("ashish.k@gai.co.in");
		 driver.findElement(By.id("edit-profile-main-field-first-name-und-0-value")).sendKeys("Raghav");
		 driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys("Bhavser");
		/*
		 driver.findElement(By.id("edit-profile-main-field-profile-picture-und-0-upload")).sendKeys("D:\\Ashish Laptop\\Certificates\\Ashish.jpg"); 
		 driver.findElement(By.id("edit-profile-main-field-profile-picture-und-0-upload-button")).click();*/
		 driver.findElement(By.id("edit-profile-main-field-organization-und-0-value")).sendKeys("Gai Technology");
		 driver.findElement(By.id("edit-profile-main-field-designation-und-0-value")).sendKeys("Member Technical Staff");
		 
		 driver.findElement(By.id("edit-submit")).click();
		 
		 
		// driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("edit-name")).sendKeys("admin");
			driver.findElement(By.id("edit-pass")).sendKeys("gai#worxogo");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.linkText("People")).click();		
			driver.findElement(By.linkText("RaghavBhavser")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("edit-status-1")).click();
			driver.findElement(By.xpath(".//*[@id='edit-roles-9']")).click();
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath(".//*[@id='branding']/ul/li[3]/a")).click();
			driver.findElement(By.id("edit-pass-pass1")).sendKeys("@test1234T");
			driver.findElement(By.id("edit-pass-pass2")).sendKeys("@test1234T");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath(".//*[@id='admin-menu-account']/li[1]/a")).click();	
			driver.findElement(By.id("edit-name")).sendKeys("RaghavBhavser");
			driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
			driver.findElement(By.id("edit-submit")).click();	 
	}
}

