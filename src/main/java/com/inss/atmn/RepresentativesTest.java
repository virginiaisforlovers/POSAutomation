
package com.inss.atmn;

import com.inss.atmn.POJOs.OfficeListPOJO;
import com.inss.atmn.Pages.RepresentativesPage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.inss.atmn.POJOs.OfficeListPOJO;
import com.inss.atmn.RepresentativesTestBase;
import org.junit.Test;

public class RepresentativesTest extends RepresentativesTestBase {



  @Test
  public void assignToPOJO() {

    public methodMy (OfficeListPOJO officeCalifornia) {
      OfficeListPOJO officeListCalifornia = new OfficeListPOJO();
      officeListCalifornia.setDistrict(representativesPage.getDistrictsByState("California"));
      String db1 = officeListCalifornia.getDistrict().get(1);
    }

  }

}


