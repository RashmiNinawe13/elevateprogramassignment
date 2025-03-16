package fifteenMarch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		FileInputStream file = new FileInputStream("C:\\Users\\rashm\\Downloads\\15 march assignment.xlsx");
		Workbook book =  WorkbookFactory.create(file);
		
		String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='submit']")).click();


	}

}
