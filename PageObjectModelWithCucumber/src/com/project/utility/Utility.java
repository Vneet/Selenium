package com.project.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility 
{
	public static WebDriver driver ;
	public static Properties prop ;
	public static WebDriver initializeBrowser() throws Exception
	{
		prop = new Properties();
		File src = new File("C:\\Users\\kanwalbhatia\\Desktop\\Vins\\Selenium\\WorkSpace\\PageObjectModelWithCucumber\\data.properties");
	    FileInputStream fis = new FileInputStream(src);
	    prop.load(fis);
	    String browserName = prop.getProperty("browser");
	    if (browserName.equalsIgnoreCase("Chrome"))
	    {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanwalbhatia\\Desktop\\Vins\\Selenium\\ChromeDriver\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	     }
	    else if (browserName.equalsIgnoreCase("InternetExplorer"))
	    {
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\kanwalbhatia\\Desktop\\Vins\\Selenium\\ChromeDriver\\internetexplorerdriver.exe");	
	    driver = new InternetExplorerDriver();
	    driver.get(prop.getProperty("url"));
	     }	
	    else
	    {
		    System.setProperty("webdriver.firefox.driver", "C:\\Users\\kanwalbhatia\\Desktop\\Vins\\Selenium\\ChromeDriver\\Firefoxdriver.exe");	
		    driver = new FirefoxDriver();
		    driver.get(prop.getProperty("url"));
		     }		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
	  }
}
