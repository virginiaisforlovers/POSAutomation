package com.inss.atmn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

  protected static WebDriver driver;

  @BeforeClass
  public static void initDriver() {
    System.setProperty("webdriver.chrome.driver",
        "/Users/apple4u/Desktop/IT/PosExperiments/chromedriver");
    driver = new ChromeDriver();
  }
}
