package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);
		System.out.println("webdriver is open");
		WebElement alert2 = driver.findElement(By.xpath("//*[@name='promptalertbox1234']"));
		
		boolean b = alert2.isDisplayed();
		if(b) {
			System.out.println(b);
		}
		String text = alert2.getText();
		//System.out.println(text);
		//alert2.click();
		
		Thread.sleep(4000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("yes");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		WebElement sad = driver.findElement(By.xpath("//*[@id='demoone']"));
		System.out.println(sad.getText());
		driver.close();
		
		
		
	}

}
