package Seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentURL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://pracmedppe.azurewebsites.net/";
		driver.get(url);
		System.out.println("browser is open");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		 String title = "PracMed Home";
		if(driver.getTitle().equals(title)) {
			System.out.println("matched ");
		}else {
			System.out.println("not matched");
		}
	
		
	}

}
