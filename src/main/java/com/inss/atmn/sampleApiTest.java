package com.inss.atmn;

import static sun.plugin.javascript.navig.JSType.URL;

import io.restassured.http.Headers;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class sampleApiTest extends sampleApiTestBase {

  @Test
  public void createTable() {
    Response response = sendPostReq(headers, officeListPOJO, URL);
  }

  protected Response sendPostReq(Headers headers, Object object, String uri) {
    return getRespAndLog((Response) getRequest(headers).body(object).post(uri, new Object[0]));
  }

  private Response getRespAndLog(Response response) {
    return (Response) ((ValidatableResponse) ((ValidatableResponse) response.then()).log().all())
        .extract().response();
  }

  private RequestSpecification getRequest(Headers headers) {
    return (RequestSpecification) RestAssured.given().headers(headers).relaxedHTTPSValidation()
        .log().all();
  }
  
}
