package fifteenMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\rashm\\Downloads\\test cases of write wave - Sheet1.pdf");
	driver.findElement(By.cssSelector("#file-submit")).click();
	}
}
