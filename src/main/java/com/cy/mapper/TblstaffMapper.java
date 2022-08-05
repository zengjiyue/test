package com.cy.mapper;

import com.cy.bean.Tblstaff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblstaffMapper {
    public Tblstaff findStaff(@Param("staffAcc") String acc, @Param("staffPwd") String pwd);
}
