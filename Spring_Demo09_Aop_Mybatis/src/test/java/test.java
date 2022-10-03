import com.dao.AccountDao;
import com.pojo.Account;
import com.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class test {

    @Test
    public void testselect() throws IOException {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.selectAll();

        System.out.println(accounts);

        Account account = accountDao.selectByName("Tom");
        System.out.println(account);

//
//        Account account1 = accountDao.selectById(2);
//        System.out.println(account1);

//        Account account=new Account(1,"Tom",400);
//        Integer integer = accountDao.updateById(account);
//        System.out.println(integer);
        sqlSession.close();
    }

}
