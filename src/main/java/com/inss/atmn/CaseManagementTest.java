package com.inss.atmn;

import org.junit.Assert;
import org.junit.Test;

public class CaseManagementTest extends CaseManagementTestBase {



  @Test
  public void   importPageLinkFunctional() {
    caseManagementPage.clickImportEventsLink();
    Assert.assertTrue(caseManagementPage.getImportCasesHeaderText().contains("Import Cases"));
  }

  @Test
  public void   exportPageLinkFunctional() {
    caseManagementPage.clickExportEventsLink();
    //Assert.assertTrue(caseManagementPage.getImportCasesHeaderText().contains("Import Cases"));
  }

  public static void main(String[] args) {
    //Utils utils = null;
    Utils.myUtil();
  }

  }

