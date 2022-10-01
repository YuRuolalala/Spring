package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"dao","service","control"})
@PropertySource("jdbc.properties")  //跟上面一样，想写很多个要用大括号写数组，不能用通配符
public class SpringConfig {
}
