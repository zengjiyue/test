package com.cy.bean;


public class Tblpower {

  private long powerId;
  private String powerName;
  private String url;
  private long parentId;

  @Override
  public String toString() {
    return "Tblpower{" +
            "powerId=" + powerId +
            ", powerName='" + powerName + '\'' +
            ", url='" + url + '\'' +
            ", parentId=" + parentId +
            '}';
  }

  public Tblpower(long powerId, String powerName, String url, long parentId) {
    this.powerId = powerId;
    this.powerName = powerName;
    this.url = url;
    this.parentId = parentId;
  }

  public Tblpower() {
  }

  public long getPowerId() {
    return powerId;
  }

  public void setPowerId(long powerId) {
    this.powerId = powerId;
  }


  public String getPowerName() {
    return powerName;
  }

  public void setPowerName(String powerName) {
    this.powerName = powerName;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

}
