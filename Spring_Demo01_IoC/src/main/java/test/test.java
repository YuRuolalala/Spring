package test;

import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.impl.BookServiceImpl;

public class test {
    public static void main(String[] args) {
//        BookService bookService=new BookServiceImpl();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookDao bookdao = (BookDao) ctx.getBean("bookdao");
        bookdao.save();

        BookService bookservice = (BookService) ctx.getBean("bookservice");

        bookservice.save();
    }
}
