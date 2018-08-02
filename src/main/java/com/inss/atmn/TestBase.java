package com.inss.atmn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    WebDriver driver = new ChromeDriver();

@BeforeClass
public void initDriver(){
    System.setProperty("webdriver.chrome.driver","/Users/apple4u/Desktop/IT/PosExperiments/POSAutomation2/src/main/resources/chromedriver.exe");

    driver.get("http://the-internet.herokuapp.com/login");
    }

public class TestBase {


}

  @AfterClass
  public void killDriver() {
    driver.quit();
  }
