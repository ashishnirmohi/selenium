package AdminCreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Evaluator {
	WebDriver driver;
	
	@Test
	public void AccountAdminlogin(){
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");	
		 driver.findElement(By.id("edit-name")).sendKeys("admin");
		 driver.findElement(By.id("edit-pass")).sendKeys("gai#worxogo");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.linkText("People")).click();
		 driver.findElement(By.linkText("Add user")).click();
		 driver.findElement(By.id("edit-name")).sendKeys("AshishEvaluator");
		 driver.findElement(By.id("edit-mail")).sendKeys("ashish5@mailinator.com");
		 driver.findElement(By.id("edit-pass-pass1")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-pass-pass2")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-roles-5")).click();
		 driver.findElement(By.id("edit-profile-main-field-first-name-und-0-value")).sendKeys("Ashish");
		 driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys("Evaluator");
		 driver.findElement(By.id("edit-profile-main-field-profile-picture-und-0-upload")).sendKeys("D:\\Ashish Laptop\\Certificates\\Ashish.jpg");
		 driver.findElement(By.id("edit-profile-main-field-profile-picture-und-0-upload-button")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-organization-und-0-value']")).sendKeys("Gai Technologies Pvt Ltd");
		 driver.findElement(By.xpath(".//*[@id='edit-profile-main-field-designation-und-0-value']")).sendKeys("QA");
		 Select newselect = new Select(driver.findElement(By.id("edit-profile-main-field-target-und")));
		 newselect.selectByVisibleText("Air-Tell-Finance");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.linkText("Log out")).click();
		 driver.findElement(By.id("edit-name")).sendKeys("AshishEvaluator");
		 driver.findElement(By.id("edit-pass")).sendKeys("@test1234T");
		 driver.findElement(By.id("edit-submit")).click();
	}
}

