package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classAsing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement goToElement = driver.findElement(By.xpath("//span[text()='Ⓒ']"));
		 Actions act =new Actions(driver);
		 act.scrollToElement(goToElement).perform();
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("snap3.png");
			FileUtils.copyFile(screenshotAs, dest);
		 
		
	}

}
