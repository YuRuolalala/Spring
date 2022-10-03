package com.service.impl;

import com.dao.ResourceDao;
import com.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    public boolean openURL(String url, String password) {
        return resourceDao.readResources(url,password);
    }
}
