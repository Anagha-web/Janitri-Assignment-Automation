package Janitri.Login_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	    protected WebDriver driver;  // make this protected so LoginTest can access it

	    @BeforeMethod
	    public void setUp() {
	        WebDriverManager.chromedriver().setup(); // THIS should come  1st
	        driver = new ChromeDriver();  // initialize afetr setting up
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://dev-dash.janitri.in/");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) driver.quit();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

