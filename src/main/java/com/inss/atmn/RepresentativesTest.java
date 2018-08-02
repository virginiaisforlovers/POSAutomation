package com.inss.atmn;

import com.inss.atmn.Pages.RepresentativesPage;
import org.junit.Test;

public class RepresentativesTest extends RepresentativesTestBase {

  @Test
  public void testReps(){
    driver.get("http://the-internet.herokuapp.com/login");
    representativesPage.getDistrictsByState("Arizona");

  }


}
