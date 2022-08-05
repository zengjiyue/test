package com.cy.bean;


public class Tblstaff {

  private long staffId;
  private String staffAcc;
  private String staffPwd;
  private long roleId;
  private String staffName;
  private String staffAdd;
  private long msgState;

  public Tblstaff() {
  }

  public Tblstaff(long staffId, String staffAcc, String staffPwd, long roleId, String staffName, String staffAdd, long msgState) {
    this.staffId = staffId;
    this.staffAcc = staffAcc;
    this.staffPwd = staffPwd;
    this.roleId = roleId;
    this.staffName = staffName;
    this.staffAdd = staffAdd;
    this.msgState = msgState;
  }

  @Override
  public String toString() {
    return "Tblstaff{" +
            "staffId=" + staffId +
            ", staffAcc='" + staffAcc + '\'' +
            ", staffPwd='" + staffPwd + '\'' +
            ", roleId=" + roleId +
            ", staffName='" + staffName + '\'' +
            ", staffAdd='" + staffAdd + '\'' +
            ", msgState=" + msgState +
            '}';
  }

  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public String getStaffAcc() {
    return staffAcc;
  }

  public void setStaffAcc(String staffAcc) {
    this.staffAcc = staffAcc;
  }


  public String getStaffPwd() {
    return staffPwd;
  }

  public void setStaffPwd(String staffPwd) {
    this.staffPwd = staffPwd;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }


  public String getStaffAdd() {
    return staffAdd;
  }

  public void setStaffAdd(String staffAdd) {
    this.staffAdd = staffAdd;
  }


  public long getMsgState() {
    return msgState;
  }

  public void setMsgState(long msgState) {
    this.msgState = msgState;
  }

}
