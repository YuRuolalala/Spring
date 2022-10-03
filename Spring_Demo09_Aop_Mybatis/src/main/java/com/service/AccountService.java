package com.service;

import com.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {
    public List<Account> selectAll();
    public Account selectByName(String name);
    public Account selectById(Integer id);
    public Integer deleteById(Integer id);
    public Integer save(Account account);
    public Integer update(Account account);
}
