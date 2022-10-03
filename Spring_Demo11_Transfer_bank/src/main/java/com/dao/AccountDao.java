package com.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {


    void inMoney(@Param("name")String name,@Param("money")Integer money);


    void outMoney(@Param("name")String name,@Param("money")Integer money);
}
