package com.inss.atmn;

import com.inss.atmn.POJOs.OfficeListPOJO;
import io.restassured.http.Headers;

public class sampleApiTestBase {

  protected Headers headers = getWebServicesHeaders();

  private Headers getWebServicesHeaders() {
    return (new Builder()).withHeaders(getCommonPlatformHeaders())
        .withHeaderAndDefaultValue(HeaderDeafults.X_RULE_PLATFORM_USER)
        .withHeaderAndDefaultValue(HeaderDefaults.X_OPENAPI_CLIENTID).build().generateHeaders();
  }

  OfficeListPOJO officeListPOJO;

  String URL = "https://data.fixer.io/api/latest";


}
