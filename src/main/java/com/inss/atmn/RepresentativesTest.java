package com.inss.atmn;

import com.inss.atmn.Pages.RepresentativesPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RepresentativesTest extends RepresentativesTestBase {

  RepresentativesPage representativesPage;
  protected WebDriver driver;

  @Before
  public void initDriver() {


    System.setProperty("webdriver.chrome.driver",
        "/Users/apple4u/Desktop/IT/PosExperiments/chromedriver");

    driver = new ChromeDriver();
    representativesPage = PageFactory.initElements(driver, RepresentativesPage.class);
  }

  @Test
  public void testReps(){
    driver.get("https://www.house.gov/representatives");
    representativesPage.getDistrictsByState("Arizona");

  }

  @After
  public void killDriver() {
    driver.quit();
  }
}
