package fifteenMarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        // Handling Single iFrame
        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World1!");
        Thread.sleep(2000);
        driver.switchTo().defaultContent(); // Switching back to main page
        
        // Navigating to Nested iFrame section
        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
        Thread.sleep(2000);
        
        // Switching to first (outer) frame
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);
        
        
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);
        
      
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inside Nested iFrame!");
        Thread.sleep(2000);
        
        // Switching back to main page
        driver.switchTo().defaultContent();

        // Closing the browser
        driver.quit();
    }
}
