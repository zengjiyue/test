package com.cy.service.serviceImpl;

import com.cy.bean.Tblrole;
import com.cy.mapper.RoleMapper;
import com.cy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Tblrole> findAllRole() {
        return roleMapper.findAllRole();
    }
}
