package test;

import config.SpringConfig;
import dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookService;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);
        System.out.println(bookDao);
//        ctx.close();
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);

        bookService.save();
    }
}
