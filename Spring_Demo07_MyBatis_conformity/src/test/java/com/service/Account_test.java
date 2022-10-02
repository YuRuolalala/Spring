package com.service;

import com.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Account_test {
    @Autowired
    private AccountService accountService;

    @Test
    public void selectbyid(){
        System.out.println(accountService.selectById(2));
    }

    @Test
    public void selectall(){
        System.out.println(accountService.selectAll());
    }
}
