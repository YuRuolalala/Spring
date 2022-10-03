package com.service.Impl;


import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    public List<Account> selectAll() {
        return accountDao.selectAll();
    }

    public Account selectByName(String name) {
        return accountDao.selectByName(name);
    }

    public Account selectById(Integer id) {
        return accountDao.selectById(id);
    }

    public Integer deleteById(Integer id) {
        return accountDao.deleteById(id);
    }

    public Integer save(Account account) {
        return save(account);
    }

    public Integer update(Account account) {
        return update(account);
    }
}
