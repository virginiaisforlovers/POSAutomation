package com.inss.atmn;

import org.junit.Assert;
import org.junit.Test;

public class CaseManagementTest extends CaseManagementTestBase {

  @Test
  public void   importPageLinkFunctional() {
    caseManagementPage.clickImportEventsLink();
    Assert.assertTrue(caseManagementPage.getImportCasesHeaderText() == "Import Cases");

  }

}
