package Seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String title = "";
		if(driver.getTitle().equals(title)){
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
		System.out.println( "title name is " + driver.getTitle());
		WebElement FN = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		FN.sendKeys("Anusha");
		 WebElement LN = driver.findElement(By.xpath("//*[@Placeholder='Last Name']"));
		 LN.sendKeys("Rasoori");
		 WebElement EN = driver.findElement(By.xpath("//*[@type='email']"));
		 EN.sendKeys("Anusha.Rasoori@gmail.com");
		 WebElement emt = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[3]/label"));
		 emt.getText();
		System.out.println("verify element name is " +  emt.getText());
		
		WebElement RN =	driver.findElement(By.xpath("//*[@name='radiooptions']"));
		boolean  B = RN.isDisplayed();
		if(B) {
			System.out.println(B);
		}
		RN.click();
		
		
		WebElement Rdn =	driver.findElement(By.xpath("//*[@value ='FeMale']"));
		Rdn.isSelected();
		
	
		
		
		
		
	}

}
