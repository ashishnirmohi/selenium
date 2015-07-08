import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


//import java.util.concurrent.TimeUnit;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SecondChildTwoInOneReg {
	jxl.Sheet s;
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	}
	
	@Test
	public void SecondChildDD() throws BiffException, IOException, InterruptedException{
		FileInputStream fin = new FileInputStream("C:\\Users\\Uni\\Desktop\\SecondchildDD.xls");
		Workbook wb = Workbook.getWorkbook(fin);
		s = wb.getSheet(0);
		for (int row = 1; row < s.getRows(); row++) {
		driver.get("http://staging-lw.gailabs.com/");
		driver.findElement(By.linkText("Member Log In")).click();
		driver.findElement(By.id("edit-name")).sendKeys("ashishkumar@mailinator.com");
		driver.findElement(By.id("edit-pass")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
		driver.findElement(By.xpath(".//*[@id='block-views-parent-profile-detail-block']/div/div[2]/div/div[8]/span/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		Thread.sleep(9000);
		
		String childfirstname = s.getCell(0, row).getContents();
		System.out.println("childfirstname" + childfirstname);
		driver.findElement(By.id("edit-field-first-name-und-0-value")).sendKeys(childfirstname);
		
		String childlastname = s.getCell(1, row).getContents();
		System.out.println("childlastname" + childlastname);
		driver.findElement(By.id("edit-field-last-name-und-0-value")).sendKeys(childlastname);
		
		String childdob = s.getCell(2, row).getContents();
		System.out.println("childdob" + childdob);
		driver.findElement(By.xpath(".//*[@id='edit-field-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys(childdob);
		
		String password = s.getCell(3, row).getContents();
		System.out.println("password" + password);
		driver.findElement(By.id("edit-pass-pass1")).sendKeys(password);
		
		String reenterpassword = s.getCell(4, row).getContents();
		System.out.println("reenterpassword" + reenterpassword);
		driver.findElement(By.id("edit-pass-pass2")).sendKeys(reenterpassword);
		
		String schoolname = s.getCell(5, row).getContents();
		System.out.println("schoolname" + schoolname);
		driver.findElement(By.id("edit-profile-student-field-schools-und")).sendKeys(schoolname);
		
		String schoollocation = s.getCell(6, row).getContents();
		System.out.println("schoollocation" + schoollocation);
		driver.findElement(By.id("edit-profile-student-field-school-city-und")).sendKeys(schoollocation);
		
		 Select clas = new Select(driver.findElement(By.xpath(".//*[@id='edit-profile-student-field-class-user-und-hierarchical-select-selects-0']")));
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
			driver.findElement(By.xpath(".//*[@id='edit-profile-student-field-class-user-und-hierarchical-select-dropbox-add']")).click();
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath(".//*[@id='edit-profile-student-field-term-and-condetion-und-1']")).click();
			driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
			driver.findElement(By.xpath(".//*[@id='messages-inner']/table/tbody/tr[2]/td[2]/div[2]/a")).click();
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

