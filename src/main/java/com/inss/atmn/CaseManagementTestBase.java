package com.inss.atmn;

import com.inss.atmn.Pages.CaseManagementPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CaseManagementTestBase extends TestBase {

  CaseManagementPage caseManagementPage;

  @Before
  public void initPage() {
    caseManagementPage = PageFactory.initElements(driver, CaseManagementPage.class);
    driver.get("https://projects.consiliencesoftware.com/mavenqa/login.do");
  }

  @After
  public void quitPage() {
    driver.quit();
  }
}
