package test;

import dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserDao userdao = (UserDao) ctx.getBean("userdao");

        userdao.save();
    }
}
