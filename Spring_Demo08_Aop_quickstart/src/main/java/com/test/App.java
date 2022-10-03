package com.test;

import com.config.SpringConfig;
import com.dao.BookDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
//        bookDao.update();
        System.out.println(bookDao.getClass());
    }
}
