package com.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
