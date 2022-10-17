package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@Test(dataProvider ="dataprovider" )
	public void companydetails(String subject,String purchaseorder, String salescommission) throws InterruptedException
	{
	String key="webdriver.chrome.driver";
	String value= "./software/chromedriver.exe";
	
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	driver.get(" http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("(//a[@href='index.php?module=Invoice&action=index'])[1]")).click();
	
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(subject);
	driver.findElement(By.xpath("//input[@name='vtiger_purchaseorder']")).sendKeys(purchaseorder);
	driver.findElement(By.xpath("//input[@name='salescommission']")).sendKeys(salescommission);
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
	driver.quit();
	Thread.sleep(2000);
}
	
	@DataProvider()
	public Object[][] dataprovider()
	{
		Object[][] objArr= new Object[3][3];
		objArr[0][0]="aaa";
		objArr[0][1]="989786";
		objArr[0][2]="798608";
		
		objArr[0][0]="bbb";
		objArr[0][1]="777777";
		objArr[0][2]="787878";
		
		objArr[0][0]="ccc";
		objArr[0][1]="9222222";
		objArr[0][2]="2121212";
		return objArr;
	}
}	
	
	
	
	
	
	
	
	
	
	
