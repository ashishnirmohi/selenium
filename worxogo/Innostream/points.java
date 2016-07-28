package Innostream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class points {
WebDriver driver;
	
	@Test
	public void points_like_follow_etc(){
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");
		 driver.findElement(By.id("edit-name")).sendKeys("AshishPlatformAdmin");
		 driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.className("dropdown-toggle")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[1]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[1]/a/img")).click();
		 driver.findElement(By.xpath(".//*[@id='node-1084']/h2/a/div/div/div")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-comment-body-und-0-value--2']")).sendKeys("Test Comment");
		 driver.findElement(By.xpath(".//*[@id='edit-submit--4']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[2]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[1]/a/img")).click();
		 driver.findElement(By.xpath(".//*[@id='node-1084']/h2/a/div/div/div")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-follow-unfollow_1084']/span/a")).click();
		 
		 /*
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[3]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[4]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[1]/a/img")).click();
		 driver.findElement(By.xpath(".//*[@id='node-1084']/h2/a/div/div/div")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-field-idea-description-und-0-value--2']")).sendKeys("Test idea submission");
		 driver.findElement(By.xpath(".//*[@id='edit-submit--5']")).click();
	
		 
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='block-menu-menu-administer-platform-']/ul/li[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[5]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[1]/a/img")).click(); 	*/
		 /*
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[3]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[4]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[5]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[6]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[7]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[8]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[9]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[10]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Run cron")).click();
		 //driver.navigate().to("https://worxogo-innoxogo.gailabs.com/admin/reports/status");
		 driver.findElement(By.linkText("Log out")).click();
		 
		 driver.findElement(By.id("edit-name")).sendKeys("admin");
		 driver.findElement(By.id("edit-pass")).sendKeys("gai#worxogo");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.xpath(".//*[@id='admin-menu-icon']/li/a/img")).click();
		 
		 driver.findElement(By.id("edit-name")).sendKeys("AshishPlatformAdmin");
		 driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-submit")).click();
		 */
	}
}
