package com.cy.service.serviceImpl;

import com.cy.bean.Tblstaff;
import com.cy.mapper.TblstaffMapper;
import com.cy.service.TblstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TblstaffServiceImpl implements TblstaffService {
    @Autowired
    private TblstaffMapper tblstaffMapper;
    @Override
    public Tblstaff findStaff(String acc, String pwd) {
        return tblstaffMapper.findStaff(acc, pwd);
    }
}
