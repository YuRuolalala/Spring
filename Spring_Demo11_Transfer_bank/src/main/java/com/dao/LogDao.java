package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {

    public void log(String info);
}
