package dao.impl;

import dao.BookDao;

public class BookDaoImpl implements BookDao {

    public void save() {

        System.out.println("BookDao savae");
    }
    //表现bean初始化对应的操作
    public void init(){
        System.out.println("dao init...");
    }
    //表现bean销毁前对应的操作
    public void destroy(){
        System.out.println("dao destroy...");
    }
}
