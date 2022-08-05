package com.cy.bean;


public class Tblrole {

  private long roleId;
  private String roleName;
  private String roleDescribe;

  @Override
  public String toString() {
    return "Tblrole{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            ", roleDescribe='" + roleDescribe + '\'' +
            '}';
  }

  public Tblrole(long roleId, String roleName, String roleDescribe) {
    this.roleId = roleId;
    this.roleName = roleName;
    this.roleDescribe = roleDescribe;
  }

  public Tblrole() {
  }

  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDescribe() {
    return roleDescribe;
  }

  public void setRoleDescribe(String roleDescribe) {
    this.roleDescribe = roleDescribe;
  }

}
