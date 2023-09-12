package Seleniummethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		System.out.println("open");
		
		List<WebElement> check = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
//		check.click();
		int si = check.size();
		System.out.println(si);
		for(int i =0; i<si; i++) {
			check.get(i).click();
		}
		
	}



		
	}


