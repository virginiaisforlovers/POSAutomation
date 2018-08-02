package com.inss.atmn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@BeforeClass
    System.setProperty("webdriver.chrome.driver","/Users/tmaher/code/java/selenium/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

public class TestBase {




}

@AfterClass
      driver.quit();