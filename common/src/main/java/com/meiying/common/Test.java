package com.meiying.common;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class Test {

    @Autowired
    static  DataSource dataSource;

    public static void main(String[] args) {
        System.out.println(dataSource);
    }
}
