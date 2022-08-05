package com.cy.mapper;

import com.cy.bean.Tblrole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    public List<Tblrole> findAllRole();
}
