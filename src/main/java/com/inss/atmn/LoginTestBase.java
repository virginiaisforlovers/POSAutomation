package com.inss.atmn;

import com.inss.atmn.Pages.BasePage;
import com.inss.atmn.Pages.CaseManagementPage;
import com.inss.atmn.Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

public class LoginTestBase extends TestBase {

LoginPage loginPage;
//CaseManagementPage caseManagementPage;

  @Before
  public void initPage() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    //caseManagementPage = PageFactory.initElements(driver, CaseManagementPage.class);
    driver.get("https://projects.consiliencesoftware.com/mavenqa/login.do");
  }

  //@After
  //public void quitPage() {
   // driver.quit();
  //}
}
