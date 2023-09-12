package Seleniummethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("headless");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	System.out.println("The headless brower was open.....");
	
	


String title = "aaaaaaaa";
if(driver.getTitle().equals(title)) {
	System.out.println("matched");
	
}else {
	System.out.println("not matched");
}
System.out.println(driver.getTitle());

String title1 = "register";
if(driver.getTitle().equals(title1)) {
	System.out.println("matched");
}else {
System.out.println("notmatched");

}
System.out.println(driver.getTitle());
}

	
}

