package Innostream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class IdeaSubmissionPoints {
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
		 driver.findElement(By.xpath(".//*[@id='wg-administer-platform-activities']/div/fieldset[4]/legend/a")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='navbar']/div/div[1]/a/img")).click();
		 driver.findElement(By.xpath(".//*[@id='node-1084']/h2/a/div/div/div")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-field-idea-description-und-0-value--2']")).sendKeys("Idea submission for Testing");
		 driver.findElement(By.xpath(".//*[@id='edit-submit--5']")).click();
		 driver.findElement(By.xpath(".//*[@id='tab']/img")).click();
		 driver.findElement(By.xpath(".//*[@id='block-woxgo-custom-wg-user-menu']/div/ul/li/ul/li[6]/a")).click();
		/*
		 driver.findElement(By.id("edit-name")).sendKeys("admin");
		 driver.findElement(By.id("edit-pass")).sendKeys("gai#worxogo");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.xpath(".//*[@id='admin-menu-menu']/li[2]/a")).click();
		 //driver.findElement(By.linkText("delete")).click();
		
		driver.findElement(By.xpath(".//*[@id='edit-nodes-1270']")).click();
		Select click = new Select(driver.findElement(By.xpath(".//*[@id='edit-operation']")));		 
		click.selectByVisibleText("Delete selected content");
		driver.findElement(By.xpath(".//*[@id='edit-submit--2']")).click();
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
	
		driver.findElement(By.linkText("edit")).click();
		driver.findElement(By.xpath(".//*[@id='edit-delete']")).click(); */	 
		}
	}
