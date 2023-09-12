package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);
		System.out.println("webdriver is open");
		WebElement alert1 = driver.findElement(By.xpath("//*[@name='confirmalertbox']"));
		boolean b1 = alert1.isDisplayed();
		if(b1) {
			System.out.println(b1);
		}
		
		
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert1.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
