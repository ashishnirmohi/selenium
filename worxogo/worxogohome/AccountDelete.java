package worxogohome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AccountDelete {
	WebDriver driver;
	
	@Test
	public void Accountdeletelogin(){
		System.setProperty("webdriver.chrome.driver",
				 "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://worxogo-innoxogo.gailabs.com/");	
		 driver.findElement(By.id("edit-name")).sendKeys("admin");
		 driver.findElement(By.id("edit-pass")).sendKeys("gai#worxogo");
		 driver.findElement(By.id("edit-submit")).click();
		 driver.findElement(By.linkText("People")).click();
		 
		 driver.findElement(By.linkText("RaghavBhavser")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("edit-cancel")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-user-cancel-method--5']")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		 
		 
		 driver.findElement(By.linkText("AshishKumar")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("edit-cancel")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-user-cancel-method--5']")).click();
		 driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();	
		 driver.findElement(By.linkText("Log out")).click();
	
	}
}