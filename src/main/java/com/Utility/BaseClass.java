package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void BS() throws Exception {
		config=new ConfigDataProvider();
		 excel=new ExcelDataProvider();
		
		
	}
	
	@Parameters({"Browser"})
	@BeforeMethod
	public void setUp(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}
		driver.get(config.getStageURL());
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
