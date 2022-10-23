package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Throwable
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Acer/Desktop/flipkart.html");
		 List<WebElement> count = driver.findElementsByXPath("//table[@id='tab1']/tr[1]/tbody/tr[*]/td[1]/input");
		
		 for(WebElement tt:count)
		{
			tt.click();
		}
	}

}
