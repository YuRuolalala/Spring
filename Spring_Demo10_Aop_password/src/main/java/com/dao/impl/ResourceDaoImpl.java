package com.dao.impl;

import com.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    public boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
