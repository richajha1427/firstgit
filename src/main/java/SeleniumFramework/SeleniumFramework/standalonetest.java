package SeleniumFramework.SeleniumFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standalonetest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("richathakur@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Gmail@123");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> products =  driver.findElements(By.className("col-sm-10"));
		
		
		 for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
			
		}
		
	
		

	}

}
