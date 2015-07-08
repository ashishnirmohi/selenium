
	import java.io.FileInputStream;
	import java.util.concurrent.TimeUnit;
	import jxl.Workbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

public class studentloginDD {
		jxl.Sheet s;
		WebDriver driver;

@BeforeMethod
public void setUp() {
driver = new FirefoxDriver();
driver.manage().window().maximize();
}

@Test
public void searchGoogle() throws Exception {
FileInputStream fi = new FileInputStream("C:\\Users\\uni\\Desktop\\studentlogindd.xls");
Workbook w = Workbook.getWorkbook(fi);
s = w.getSheet(0);
for (int row = 1; row < s.getRows(); row++) {
driver.get("http://staging-lw.gailabs.com/");
driver.findElement(By.xpath(".//*[@id='toboggan-login-link']")).click();

String Username = s.getCell(0, row).getContents();
System.out.println("Username" + Username);
driver.findElement(By.id("edit-name")).sendKeys(Username);

String Password = s.getCell(1, row).getContents();
System.out.println("Password"+ Password);
driver.findElement(By.id("edit-pass")).sendKeys(Password);

driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
driver.findElement(By.id("edit-submit")).click();
driver.findElement(By.xpath(".//*[@id='block-lw-custom-logged-user-detail-block']/div/div/div/div/span[2]")).click();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
Thread.sleep(7000);
driver.findElement(By.xpath(".//*[@id='block-lw-custom-logged-user-detail-block']/div/div/div/ul/li[2]/a")).click();
Thread.sleep(7000);

}
		}

@AfterMethod
public void teardown(){
	
	driver.close();
	
	
}
	}