import com.config.SpringConfig;
import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class newtest {

    @Test
    public void test(){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao dao = ctx.getBean(AccountDao.class);

//        Account account = dao.selectByName("Tom");
//        System.out.println(account);
//        System.out.println(dao.selectAll());

        AccountService accountService = ctx.getBean(AccountService.class);
        List<Account> accounts = accountService.selectAll();
        accountService.selectById(1);


    }
}
