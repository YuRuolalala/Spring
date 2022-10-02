package com.dao;

import com.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountDao {

    public List<Account> selectAll();

    public Account selectByName(@Param("name")String name);

    public Account selectById(@Param("id")Integer id);

    public Integer deleteById(@Param("id")Integer id);

    public Integer save(Account account);

}
