package com.meiying.blogserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.meiying.blogserver.common.ReturnApi;
import com.meiying.blogserver.pojo.po.UserPo;
import com.meiying.blogserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    public List<UserPo> listUser() {
        List<UserPo> userList = userService.list();
        return userList;
    }

    @PostMapping("/insert")
    public String insert(UserPo user) {
        boolean rs = userService.saveOrUpdate(user);
        return JSONObject.toJSONString(rs);
    }

    //请求转发
    @DeleteMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id,  Model model) {
        boolean rs = userService.removeById(id);
       return index(model);
    }

    @GetMapping("/index")
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", listUser());
        mv.setViewName("user/index");
        return mv;
    }

    @GetMapping("/api/list")
    public String userListApi() {
        List<UserPo> users = listUser();
        return JSONObject.toJSONString(users);
    }

    @PostMapping("/api/insert")
    public String insertUserApi(@RequestParam String name, @RequestParam String nickName, @RequestParam int sex, @RequestParam String signature) {
        UserPo po = new UserPo();
        po.setName(name);
        po.setNickName(nickName);
        po.setSex(sex);
        po.setSignature(signature);
        boolean rs = userService.saveOrUpdate(po);

        ReturnApi returnApi = new ReturnApi();
        if(!rs) {
            returnApi.setCode(ReturnApi.CODE_FAIL);
        }
        return returnApi.toString();
    }
}
