package com.luckybox;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helperclass {

	protected static WebDriver driver;
	protected Properties prop = new Properties();
	
	
	 public Helperclass() {
	        driver = getDriver();
	    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\websu\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://54.205.123.182/");
        }
        return driver;//one
    }
}
