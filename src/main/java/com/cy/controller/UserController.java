package com.cy.controller;

import com.alibaba.fastjson.JSONArray;
import com.cy.bean.User;
import com.cy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@WebServlet("/login")
@Controller
@RequestMapping("/admin")
public class UserController {
    Map map = new HashMap();
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/userlist", produces= MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
    public @ResponseBody String userlist(Model model){
        System.out.println("userlist-----------");
        List<User> userList = userService.findUserList();
        String ocbj = JSONArray.toJSONString(userList);
        System.out.println(ocbj);
        return ocbj;
    }
    @RequestMapping("/delUser")
    public @ResponseBody int delUser(long id){
        int i = userService.delUser(id);

        return i;
    }
    @RequestMapping("/addUser")
    public @ResponseBody int addUser(@RequestBody User user){
        int i = userService.insertUser(user.getAcc(), user.getPwd(), user.getPicture(), user.getIdCard(), user.getRoleId());
        return i;
//        String fn=fname.getOriginalFilename();
//        System.out.println(fn);
//        try {
//            //访问的url
//            String url5=request.getServletContext().getRealPath("/upload");
//            System.out.println(url5);
//            File file = new File(url5);
//            if (!file.exists()){
//                file.mkdir();
//            }
//            fname.transferTo(new File(url5+"/"+fn));//保存file
//
//            if (pwd.equals(centerPwd)){
//                User sameUser = userService.findSameUser(acc);
//                if (sameUser==null){
//                    userService.insertUser(acc,pwd,"/upload/"+fn,idCard);
//                    return userlist(model);
//                }else {
//                    return userlist(model);
//                }
//            }else {
//                return userlist(model);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return userlist(model);
    }
    @RequestMapping("echoUser")
    @ResponseBody
    public List<User> echoUser(long id, Model model){
        List<User> users = userService.echoUser(id);
        return users;
    }
    @RequestMapping("updUser")
    @ResponseBody
    public int updUser(@RequestBody User user){
        System.out.println(user.getAcc());
        //0代表账号相同,2失败
            //访问的url

        int i = userService.updUser(user.getAcc(), user.getPwd(), user.getIdCard(), user.getRoleId());
        return i;

    }
}
