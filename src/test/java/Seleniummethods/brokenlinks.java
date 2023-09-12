package Seleniummethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://nxtgenaiacademy.com/";
		driver.get(url);
		System.out.println("browser is open");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int si = links.size();
	System.out.println(si);
	for(WebElement link: links) {
		System.out.println(link.getText()+ " "+ link.getAttribute("href"));
		
	}
	}
//asdfghjkl;sdfghjkl
}
