package com.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface AccountService {

    @Transactional
    public void transfer(String out,String in,Integer money);
}
