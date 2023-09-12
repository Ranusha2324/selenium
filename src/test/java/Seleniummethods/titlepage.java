package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlepage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);
		System.out.println("browser open");
		String title = "Demo Site – Alert and Popup – NxtGen A.I Academ";
		if(driver.getTitle().equals(title)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		System.out.println(driver.getTitle());
	}

	}


