package com.inss.atmn;

import com.inss.atmn.Pages.RepresentativesPage;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

public class RepresentativesTestBase extends TestBase{

  RepresentativesPage representativesPage;
  @Before
  public void before() {
    representativesPage = PageFactory.initElements(driver, RepresentativesPage.class);
  }

}
