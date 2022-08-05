package com.cy.bean;


public class User {

  private long id;
  private String acc;
  private String pwd;
  private String picture;
  private String idCard;
  private long roleId;

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", acc='" + acc + '\'' +
            ", pwd='" + pwd + '\'' +
            ", picture='" + picture + '\'' +
            ", idCard='" + idCard + '\'' +
            ", roleId=" + roleId +
            '}';
  }

  public User(long id, String acc, String pwd, String picture, String idCard, long roleId) {
    this.id = id;
    this.acc = acc;
    this.pwd = pwd;
    this.picture = picture;
    this.idCard = idCard;
    this.roleId = roleId;
  }

  public User() {
  }

  public User(String acc, String pwd, String picture, String idCard, long roleId) {
    this.acc = acc;
    this.pwd = pwd;
    this.picture = picture;
    this.idCard = idCard;
    this.roleId = roleId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAcc() {
    return acc;
  }

  public void setAcc(String acc) {
    this.acc = acc;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

}
