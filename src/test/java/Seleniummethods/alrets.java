package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alrets {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);
		System.out.println("webdriver is open");
		WebElement alert = driver.findElement(By.xpath("//*[@name='alertbox']"));
		boolean b = alert.isDisplayed();
		if(b) {
			System.out.println(b);
			
		}
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		alert.click();
		//this code is useful to get the text from alertpage
		System.out.println(driver.switchTo().alert().getText());
		
          driver.switchTo().alert().accept();
}}
