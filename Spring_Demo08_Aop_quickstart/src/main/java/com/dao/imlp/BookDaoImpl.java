package com.dao.imlp;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao savae");
    }

    public void update() {
        System.out.println("book dao update");
    }
}
