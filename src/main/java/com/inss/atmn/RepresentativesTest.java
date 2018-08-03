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

  @Test
  public void testReps(){
    driver.get("https://www.house.gov/representatives");
    representativesPage.getDistrictsByState("California");
  }



}
