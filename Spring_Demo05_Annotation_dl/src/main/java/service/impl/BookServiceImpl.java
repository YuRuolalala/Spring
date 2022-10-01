package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public void save() {
        System.out.println("BookService save");
        bookDao.save();
    }


    //
//    public BookServiceImpl(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    //    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
}
