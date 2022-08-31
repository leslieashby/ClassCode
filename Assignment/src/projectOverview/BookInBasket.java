package projectOverview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookInBasket {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver ChromeDriver = new ChromeDriver();
		ChromeDriver.get("http://practice.automationtesting.in/");
		
	
		
	}

}
