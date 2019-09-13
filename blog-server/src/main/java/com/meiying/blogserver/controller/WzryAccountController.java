package com.meiying.blogserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.meiying.blogserver.service.WzryAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("wzry")
public class WzryAccountController {

    @Autowired
    private WzryAccountService wzryAccountService;

    @GetMapping("/api/list")
    public String listApi() {

        return JSONObject.toJSONString(wzryAccountService.list());
    }

    @GetMapping("/index")
    public ModelAndView indexPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("wzry/index");
        mv.addObject("accountList", listApi());
        return mv;
    }

    @PostMapping("/api/insert")
    public String insert() {

        return "";
    }

    @GetMapping("/api/{id}")
    public String selectById(@PathVariable int id) {
        return JSONObject.toJSONString(wzryAccountService.getById(id));
    }

    @PutMapping("/api/update")
    public String update() {


        return "";
    }
}
