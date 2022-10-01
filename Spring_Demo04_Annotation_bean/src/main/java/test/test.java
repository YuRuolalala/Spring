package test;

import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class test {
    public static void main(String[] args) {
//        BookService bookService=new BookServiceImpl();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml.bak");

        BookDao bookdao = ctx.getBean(BookDao.class);
        bookdao.save();

        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
//        BookService bookservice = (BookService) ctx.getBean("bookservice");
//
//        bookservice.save();
    }
}
