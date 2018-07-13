package com.inss.automation.pos;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Test;

public class PropertiesTest {

  @Test
  public void getPropertyValues() throws FileNotFoundException {
    try {
      Properties properties = new Properties();
      String propFileName = "config.properties";

      InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

      if (inputStream != null) {
        properties.load(inputStream);
      }
      else {
        throw new FileNotFoundException(
            "property file '" + propFileName + "' not found in the classpath");
      }


      System.out.println(properties.getProperty("database_user_name"));

    }

    catch (Exception e) {
      System.out.println("Exception: " + e);
    }
    
  }


}
