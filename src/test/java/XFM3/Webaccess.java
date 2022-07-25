package XFM3;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webaccess {

	public static void main(String[] args) {
		
				
		
		Properties prop = new Properties();
		System.setProperty("webdriver.chrome.driver", "C:/Vikas/chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();

		driver.get("http://tcmrobur2012.bise.financialsolutions.se:402/home");
		
		driver.findElement(By.xpath("//a[@href='/home']")).click();
		//I me
		driver.getTitle();
		
		//http://tcmrobur2012.bise.financialsolutions.se:402/home
	}

}
