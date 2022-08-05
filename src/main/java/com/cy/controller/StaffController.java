package com.cy.controller;


import com.alibaba.fastjson.JSONArray;
import com.cy.bean.Tblpower;
import com.cy.bean.Tblrole;
import com.cy.bean.Tblstaff;
import com.cy.service.PowerService;
import com.cy.service.RoleService;
import com.cy.service.TblstaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private TblstaffService tblstaffService;
    @Autowired
    private PowerService powerService;

    @RequestMapping("/loginView")
    public String login(){
        return "login";//页面文件名称
    }

    @RequestMapping("/powerView")
    public String powerView(){
        return "power";
    }

    //添加所有的方法
    @RequestMapping("/addAllPower")
    @ResponseBody
    public int addAllPower(long roleId){
        int i = powerService.delAllPower(roleId);
        List<Long> allPowerId = powerService.findAllPowerId();
        for (int j = 0; j < allPowerId.size(); j++) {
            int i1 = powerService.insertPower(roleId, allPowerId.get(j));
        }
        return i;
    }

    //删除所有的方法
    @RequestMapping("/delAllPower")
    @ResponseBody
    public int delAllPower(long roleId){
        int i = powerService.delAllPowerNoParent(roleId);
        return i;
    }

    //添加权限的方法
    @RequestMapping("/addPower")
    @ResponseBody
    public int addPower(long roleId,long powerId){
        int i = powerService.insertPower(roleId, powerId);
        return i;
    }

    //删除权限的方法
    @RequestMapping("/delPower")
    @ResponseBody
    public int delPower(long roleId,long powerId){
        int i = powerService.delPower(roleId, powerId);
        return i;
    }

    @RequestMapping("/roleIdByPower")
    @ResponseBody
    public Map roleIdByPower(long roleId){
        List<Tblpower> noHavePower = powerService.noHavePower(roleId);
        List<Tblpower> havePower = powerService.findPower(roleId);
        Map map = new HashMap();
        map.put("havePower",havePower);
        map.put("noHavePower",noHavePower);

        return map;
    }

    @RequestMapping("/findAllRole")
    @ResponseBody
    public List<Tblrole> roleList(){
        return roleService.findAllRole();
    }

    @RequestMapping(value="/doLogin", produces= MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
    public @ResponseBody String staffLogin(String name, String pwd){
        System.out.println("dologin"+name+"\t"+pwd);
        Tblstaff user = tblstaffService.findStaff(name, pwd);
        String ocbj = JSONArray.toJSONString(user);
        System.out.println(ocbj);
        return ocbj;

    }

    @RequestMapping("/findPower")
    @ResponseBody
    public List<Tblpower> findPower(long roleId){
        List<Tblpower> power = powerService.findPower(roleId);
        return power;
    }

}
