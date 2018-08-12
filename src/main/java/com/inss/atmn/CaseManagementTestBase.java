package com.inss.atmn;

import com.inss.atmn.Pages.CaseManagementPage;
import com.inss.atmn.Pages.LoginPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CaseManagementTestBase extends TestBase {

  LoginPage loginPage;
  CaseManagementPage caseManagementPage;

  @Before
  public void initPage() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    caseManagementPage = PageFactory.initElements(driver, CaseManagementPage.class);
    driver.get("https://projects.consiliencesoftware.com/mavenqa/login.do");
    loginAndGotoAndPage();
  }

  private void loginAndGotoAndPage() {
    loginPage.enterUsername("sa");
    loginPage.enterPassword("sa123");
    loginPage.clickSubmitButton();
  }

  @After
  public void quitPage() {
    driver.quit();
  }
}
