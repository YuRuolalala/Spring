package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookdao1")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private String name;

    public void save() {
        System.out.println("BookDao savae  "+name);
    }


}
