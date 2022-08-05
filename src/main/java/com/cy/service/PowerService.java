package com.cy.service;

import com.cy.bean.Tblpower;

import java.util.List;

public interface PowerService {
    public List<Tblpower> findPower(long roleId);
    public List<Tblpower> noHavePower(long roleId);
    public int insertPower(long roleId,long powerId);
    public int delPower(long roleId,long powerId);
    public int delAllPower(long roleId);
    public List<Long> findAllPowerId();
    public int delAllPowerNoParent(long roleId);
}
