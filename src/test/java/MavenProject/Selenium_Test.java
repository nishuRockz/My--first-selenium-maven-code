package MavenProject;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.log.Log;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Selenium_Test {
public static WebDriver driver;
 public static WebDriver driver1; 

@BeforeTest

public void OpenBrowser() {
		
			// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	WebDriver driver1= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver1.get("https://www.google.com/");
		driver.getTitle();
		driver1.getTitle();
		String title=driver.getTitle();
		 String title1=driver1.getTitle();
		System.out.println(title);
		System.out.println(title1);
		driver.manage().window().maximize();
		driver1.manage().window().maximize();}
		 		

@AfterTest


public void closeBrowser(){
    try{
    driver.quit();
    } catch(NullPointerException e){
        System.out.println("NullPointerException thrown!");
    }
}

  

}

  

		



	

	



