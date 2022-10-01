package test;

import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.impl.BookServiceImpl;

public class test {
    public static void main(String[] args) {
//        BookService bookService=new BookServiceImpl();
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        ctx.registerShutdownHook();


        BookDao bookdao = (BookDao) ctx.getBean("bookdao");
        bookdao.save();
        //虚拟机退出之前，关闭容器
//        ctx.close();
        System.out.println("-----------------------------------");
//
        BookService bookservice = (BookService) ctx.getBean("bookservice");

        bookservice.save();

        ctx.close();
    }
}
