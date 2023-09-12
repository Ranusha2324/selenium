package Seleniummethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagescrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = "https://www.hyrtutorials.com/p/basic-controls.html";
	driver.get(url);
	System.out.println("open");
	
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0, 400)", " ");
	Thread.sleep(5000);
	List<WebElement> check = driver.findElements(By.xpath("//*[@name=\"language\"]"));
//	check.click();
	int si = check.size();
	System.out.println(si);
	for(int i =0; i<si; i++) {
		check.get(i).click();
	}
	jse.executeScript("window.scrollBy(400, -350)", " ");
}



	

}
