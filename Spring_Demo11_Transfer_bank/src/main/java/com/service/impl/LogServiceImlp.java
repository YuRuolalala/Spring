package com.service.impl;

import com.dao.LogDao;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImlp implements LogService {

    @Autowired
    private LogDao logDao;

    public void log(String out, String in, Integer money) {
        logDao.log("转账操作由"+out+"到"+in+",金额为："+money);
    }
}
