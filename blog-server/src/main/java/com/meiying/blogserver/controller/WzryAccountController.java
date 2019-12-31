package com.meiying.blogserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.meiying.blogserver.common.ReturnApi;
import com.meiying.blogserver.pojo.po.WzryAccountPo;
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
    public String insert(WzryAccountPo accountPo) {
        Boolean rs = wzryAccountService.saveOrUpdate(accountPo);
        ReturnApi returnApi = new ReturnApi();
        if(! rs) {
            returnApi.setCode(ReturnApi.CODE_FAIL);
        }
        return returnApi.toString();
    }

    @GetMapping("/api/{id}")
    public String selectById(@PathVariable int id) {
        WzryAccountPo po = wzryAccountService.getById(id);
        ReturnApi returnApi = new ReturnApi();
        returnApi.setData(po);
        if(po==null){
            returnApi.setCode(ReturnApi.CODE_FAIL);
        }
        return returnApi.toString();
    }

    @PutMapping("/api/update")
    public String update(WzryAccountPo accountPo) {
        Boolean rs = wzryAccountService.saveOrUpdate(accountPo);
        ReturnApi returnApi = new ReturnApi();
        if(! rs) {
            returnApi.setCode(ReturnApi.CODE_FAIL);
        }
        return returnApi.toString();
    }

    @GetMapping("/page/update")
    public ModelAndView updatePage(@PathVariable int id) {
        ModelAndView mv = new ModelAndView();


        mv.setViewName("wzry/index");
        mv.addObject("accountList", listApi());
        return mv;
    }
}
