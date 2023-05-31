package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsulateXpathImg {
	
		
		public static void main(String[]args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//illegal exception
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[3]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[4]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[5]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[6]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
	     	driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[7]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[8]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[9]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
}
