import com.config.SpringConfig;
import com.service.ResourceService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean root = resourceService.openURL("213123123", "root ");
        System.out.println(root);
    }
}
