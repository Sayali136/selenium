import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelSheet {
	public static void main(String[] args) {
	Properties p =new Properties();
	p.load(new FileInputStream("../demoapp/PropertyFile/file.properties"));
	driver.get(p.getProperty("appUrl"));
	WebDriver driver= new FirefoxDriver();
	driver.findElement(By.id("email")).sendKeys(p.getProperty("emailId"));
	=driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	
}
