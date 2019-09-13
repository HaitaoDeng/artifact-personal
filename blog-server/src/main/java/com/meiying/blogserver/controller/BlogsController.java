package com.meiying.blogserver.controller;

import com.meiying.blogserver.pojo.po.BlogsPo;
import com.meiying.blogserver.service.BlogsService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blogs")
public class BlogsController {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    private BlogsService blogsService;

    @GetMapping(name = "/")
    public String getBlogsList() {
        //BlogsPo blogsPo = blogsService.selectByPrimaryKey(new Integer(1));
       // return blogsPo ==null ? "用户不存在": blogsPo.toString();
        return "";
    }

}
