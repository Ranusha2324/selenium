package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://nxtgenaiacademy.com/techtalk";
		driver.get(url);
		System.out.println("webdriver is open");

		Thread.sleep(5000);
		WebElement one = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
		Thread.sleep(2000);
		WebElement two = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a"));
		Thread.sleep(2000);
		WebElement three = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[4]/a"));
		Thread.sleep(2000);
		WebElement four = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[4]/ul/li[2]/a"));
		//	mouse
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(one)
		.moveToElement(two)
		.moveToElement(three)
		.click()
		.perform();
		mouse.moveToElement(four).click().build().perform();
		
	}


		
	}


