package kr.co.itcen.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import kr.co.itcen.config.web.MVCConfig;



@Configuration
//@EnableWebMvc //MVCConfig에서 해준다
@EnableAspectJAutoProxy//<aop:aspectj-autoproxy />
@Import({MVCConfig.class})
@ComponentScan({ "kr.co.itcen.jblog.controller" }) // auto-scan
public class WebConfig {
	
}
