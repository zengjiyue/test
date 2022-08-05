package com.cy.service.serviceImpl;

import com.cy.bean.Tblpower;
import com.cy.mapper.PowerMapper;
import com.cy.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;
    @Override
    public List<Tblpower> findPower(long roleId) {
        return powerMapper.findPower(roleId);
    }

    @Override
    public List<Tblpower> noHavePower(long roleId) {
        return powerMapper.noHavePower(roleId);
    }

    @Override
    public int insertPower(long roleId, long powerId) {
        return powerMapper.insertPower(roleId, powerId);
    }

    @Override
    public int delPower(long roleId, long powerId) {
        return powerMapper.delPower(roleId, powerId);
    }

    @Override
    public int delAllPower(long roleId) {
        return powerMapper.delAllPower(roleId);
    }

    @Override
    public List<Long> findAllPowerId() {
        return powerMapper.findAllPowerId();
    }

    @Override
    public int delAllPowerNoParent(long roleId) {
        return powerMapper.delAllPowerNoParent(roleId);
    }


}
