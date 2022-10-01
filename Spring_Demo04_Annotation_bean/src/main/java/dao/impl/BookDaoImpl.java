package dao.impl;

import dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("BookDao savae");
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init...");
    }
    @PreDestroy
    public void destory(){
        System.out.println("book dao destory...");
    }
}
