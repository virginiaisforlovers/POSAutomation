package com.inss.atmn;

public class HousePojo {

  private int windowSize;
  private boolean backYardPresent;
  private String floorType:

  public HousePojo(int windowSize, boolean backYardPresent, String floorType) {
    this.windowSize = windowSize;
    this.backYardPresent = backYardPresent;
    this.floorType = floorType;
  }

  public int getWindowSize() {
    return this.windowSize;
  }

  public boolean isBackYardPresent() {
    return this.backYardPresent;
  }

  public String getFloorType() {
    return this.floorType;
  }


  //Plain Old JAVA Object
  //GOOGLE CHECKSTYLE
  //CLEAN CODE PRINCIPLE
}
