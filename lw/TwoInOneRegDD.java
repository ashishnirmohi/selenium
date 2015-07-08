import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;



import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TwoInOneRegDD {
	jxl.Sheet s;
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	}
	
	@Test
	public void TwoInOneDD() throws BiffException, IOException{
		FileInputStream fin = new FileInputStream("C:\\Users\\Uni\\Desktop\\TwoInOneReg.xls");
		Workbook wb = Workbook.getWorkbook(fin);
		s = wb.getSheet(0);
		for (int row = 1; row < s.getRows(); row++) {
		driver.get("http://staging-lw.gailabs.com/");
		driver.findElement(By.linkText("Pricing")).click();
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath(".//*[@id='messages-inner']/table/tbody/tr[2]/td[2]/div[2]/a")).click();
		
		String fname = s.getCell(0, row).getContents();
		System.out.println("fname" + fname);
		driver.findElement(By.id("edit-field-first-name-und-0-value")).sendKeys(fname);
		
		String lname = s.getCell(1, row).getContents();
		System.out.println("lname" + lname);
		driver.findElement(By.id("edit-field-last-name-und-0-value")).sendKeys(lname);
		
		String Email = s.getCell(2, row).getContents();
		System.out.println("Email" + Email);
		driver.findElement(By.id("edit-mail")).sendKeys(Email);
		
		String Mobileno = s.getCell(3, row).getContents();
		System.out.println("Mobileno" + Mobileno);
		driver.findElement(By.id("edit-field-mobile-no-und-0-value")).sendKeys(Mobileno);
		
		String Password = s.getCell(4, row).getContents();
		System.out.println("Password" + Password);
		driver.findElement(By.id("edit-pass-pass1")).sendKeys(Password);
		
		String Confirmpassword = s.getCell(5, row).getContents();
		System.out.println("Confirmpassword" + Confirmpassword);
		driver.findElement(By.id("edit-pass-pass2")).sendKeys(Confirmpassword);
		
		String Country = s.getCell(6, row).getContents();
		System.out.println("Country" + Country);
		driver.findElement(By.id("autocomplete-deluxe-input--3")).sendKeys(Country);
		
		String State = s.getCell(7, row).getContents();
		System.out.println("State" + State);
		driver.findElement(By.id("autocomplete-deluxe-input--2")).sendKeys(State);
		

		String Fname = s.getCell(8, row).getContents();
		System.out.println("Fname" + Fname);
		driver.findElement(By.id("edit-child-first-name")).sendKeys(Fname);
		

		String Lname = s.getCell(9, row).getContents();
		System.out.println("Lname" + Lname);
		driver.findElement(By.id("edit-child-last-name")).sendKeys(Lname);
		

		String Dob = s.getCell(10, row).getContents();
		System.out.println("Dob" + Dob);
		driver.findElement(By.xpath(".//*[@id='edit-childs-date-of-birth-datepicker-popup-0']")).sendKeys(Dob);
		
		String crpwd = s.getCell(11, row).getContents();
		System.out.println("crpwd" + crpwd);
		driver.findElement(By.id("edit-child-conf-password-pass1")).sendKeys(crpwd);
		
		String reenpwd = s.getCell(12, row).getContents();
		System.out.println("reenpwd" + reenpwd);
		driver.findElement(By.id("edit-child-conf-password-pass2")).sendKeys(reenpwd);
		
		String Scname = s.getCell(13, row).getContents();
		System.out.println("Scname" + Scname);
		driver.findElement(By.id("edit-child-name-of-school")).sendKeys(Scname);
		
		String Sclocation = s.getCell(14, row).getContents();
		System.out.println("Sclocation" + Sclocation);
		driver.findElement(By.xpath(".//*[@id='edit-child-school-city']")).sendKeys(Sclocation);
		
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
			
			driver.findElement(By.xpath(".//*[@id='edit-termandcondetion']")).click();
			driver.findElement(By.xpath(".//*[@id='edit-submit']")).click();
			driver.findElement(By.xpath(".//*[@id='block-lw-custom-logged-user-detail-block']/div/div/div/div/span[2]")).click();
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(".//*[@id='block-lw-custom-logged-user-detail-block']/div/div/div/ul/li[2]/a")).click();
			try {
				Thread.sleep(90000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}



}


