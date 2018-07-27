package com.inss.atmn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbExperimenting {

  String name = "Kenan";



  HousePojo singleHouse = new HousePojo(4,true, "hali");


  int yazlikWindow = yazlik.getWindowSize();
  boolean yazlikBackyard = yazlik.isBackYardPresent();
  String yazlikFloor = yazlik.getFloorType();



  int ToplamWindow = yazlik.getWindowSize() + singleHouse.getWindowSize();





  // database e baglanmak icin connection interface e olusturorum
  // connection objectinde url/dns (port number var), uname, pwd var
  // createStatement yapiyorum
  //executeQuery yapip SQL Query i send yapiyorum

  //UPDATE, INSERTINTO, DELETE does not return
  // SELECT returns a resultset
  // I am mapping resultset to an object (OBJECT MAPPING) to POJO
  // using getters and setters I am retriveing and asserting the values with the expected values




  Connection connection = new DriverManager().getConnection("10.151.13.123.aws.com/1527","username","mypaass123");
  Statement statement = connection.createStatement();
  ResultSet resultSet= statement.executeQuery("SELECT * FROM USERTABLE WHERE WINDOW_SIZE<3");


  String yazlik = resultSet.getString(1);
  resultSet.next();
  String singleHouse = resultSet.getString(1);

  HousePojo yazlik = new HousePojo(2, true, "mermer");


  POJO
  SQL queries
      JDBC connection
          creating Data Access Object






}
