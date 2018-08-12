package com.inss.atmn;

import com.inss.atmn.POJOs.OfficeListPOJO;
import com.inss.atmn.Pages.RepresentativesPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RepresentativesTestBase extends TestBase{

  protected RepresentativesPage representativesPage;



  @Before
  public void initPage() {

    representativesPage = PageFactory.initElements(driver, RepresentativesPage.class);
    driver.get("https://www.house.gov/representatives");
  }

  @After
  public void killDriver() {
    driver.quit();
  }

}
