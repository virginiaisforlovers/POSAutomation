package com.inss.atmn;

import com.inss.atmn.Pages.RepresentativesPage;
import org.junit.Test;

public class RepresentativesTest {

  RepresentativesPage representativesPage = null;
  @Test
  public void testReps(){
    representativesPage.getDistrictsByState("Arizona");

  }


}
