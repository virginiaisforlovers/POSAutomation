package com.inss.atmn;

import com.inss.atmn.Pages.CaseManagementPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends LoginTestBase{

  @Test
  public void enterCredentialsAndSubmit() {
    loginPage.enterPassword("sa");
    loginPage.enterUsername("sa123");
    loginPage.clickSubmitButton();
    Assert.assertTrue(caseManagementPage.createEventLink.isDisplayed());
  }

}
