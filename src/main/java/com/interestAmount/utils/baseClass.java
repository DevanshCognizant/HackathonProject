package com.interestAmount.utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class baseClass {

	static WebDriver driver;
	static Properties p;
	//static Logger logger;
public static WebDriver initializeBrowse() throws IOException{			//method for initializing the browser
	

		
	if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//os
		if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
		    capabilities.setPlatform(Platform.WIN11);
		} else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
		    capabilities.setPlatform(Platform.MAC);
		} else {
		    System.out.println("No matching OS..");
		      }
		//browser
		switch (getProperties().getProperty("browser").toLowerCase()) {
		    case "chrome":
		        capabilities.setBrowserName("chrome");
		        break;
		    case "edge":
		        capabilities.setBrowserName("MicrosoftEdge");
		        break;
		    default:
		        System.out.println("No matching browser");
		     }
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
	}
	else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(getProperties().getProperty("browser").toLowerCase()) 
			{
			case "chrome":
		        driver=new ChromeDriver();
		        break;
		    case "edge":
		    	driver=new EdgeDriver();
		        break;
		    default:
		        System.out.println("No matching browser");
		        driver=null;
			}
		}
	 driver.manage().deleteAllCookies(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	 return driver;													//returning the driver
	
}

public static WebDriver getDriver() {
	
	return driver;
}

public static Properties getProperties(){
	
	try {
		FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		p = new Properties();											//Creating new Properties instance
		p.load(file);
	}
	catch(Exception e)
	{
		
	}
	return p;															//returning properties object
}


}
