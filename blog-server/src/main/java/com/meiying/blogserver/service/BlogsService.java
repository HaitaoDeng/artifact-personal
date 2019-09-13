package com.meiying.blogserver.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.meiying.blogserver.mapper.BlogMapper;
import com.meiying.blogserver.pojo.po.BlogsPo;
import org.springframework.stereotype.Service;

@Service
public class BlogsService extends ServiceImpl<BlogMapper, BlogsPo> {


}
