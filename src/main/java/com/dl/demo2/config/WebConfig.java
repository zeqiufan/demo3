package com.dl.demo2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 配置重定向
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/logon").setViewName("logon");
        registry.addViewController("/logon-success").setViewName("logon-success");
        registry.addViewController("/login_real").setViewName("login_ly");
//        registry.addViewController("/api/login").setViewName("login");
        registry.addViewController("/telemeter").setViewName("telemeter");
        registry.addViewController("/communication").setViewName("communication");
        registry.addViewController("/remote").setViewName("remote");
        registry.addViewController("/protection").setViewName("protection");
        registry.addViewController("/fault-record").setViewName("fault-record");
        registry.addViewController("/setting").setViewName("setting");
    }
}
