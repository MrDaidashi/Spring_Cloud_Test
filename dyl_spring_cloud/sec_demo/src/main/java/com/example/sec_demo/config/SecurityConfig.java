//package com.example.sec_demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
///**
// * 做了Spring Security的基本配置，在内存中创建了一个认证用户的信息，用户名为dyl，密码为123456
// * 应用的每一个请求都需要验证
// * 自动生成了一个登录表单
// */
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("dyl")
//                .password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
//    }
//}
