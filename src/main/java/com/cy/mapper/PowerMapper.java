package com.cy.mapper;

import com.cy.bean.Tblpower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PowerMapper {
    public List<Tblpower> findPower(@Param("roleId")long roleId);
    public List<Tblpower> noHavePower(@Param("roleId")long roleId);
    public int insertPower(@Param("roleId")long roleId,@Param("powerId")long powerId);
    public int delPower(@Param("roleId")long roleId,@Param("powerId")long powerId);
    public int delAllPower(@Param("roleId")long roleId);
    public List<Long> findAllPowerId();
    public int delAllPowerNoParent(@Param("roleId")long roleId);
}
