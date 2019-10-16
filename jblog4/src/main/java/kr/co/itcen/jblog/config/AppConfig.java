package kr.co.itcen.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import kr.co.itcen.config.app.DBConfig;
import kr.co.itcen.config.app.MybatisConfig;



@Configuration
@EnableAspectJAutoProxy // application Context의 <aop:aspectj-autoproxy />역할
@ComponentScan({ "kr.co.itcen.jblog.service", "kr.co.itcen.jblog.repository", "kr.co.itcen.jblog.aspect" })
// application Context의 <context:component-scan>
@Import({DBConfig.class, MybatisConfig.class})
public class AppConfig {
}
