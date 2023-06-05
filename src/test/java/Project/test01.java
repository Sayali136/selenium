package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
			Properties p =new Properties();
			p.load(new FileInputStream("../demoapp/PropertyFile/file.properties"));
			WebDriver driver= new FirefoxDriver();
			driver.get(p.getProperty("appUrl"));
			driver.findElement(By.id("email")).sendKeys(p.getProperty("emailId"));
			driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
			

	}

}
