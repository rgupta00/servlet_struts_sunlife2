package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.demo"})
@EnableAspectJAutoProxy//this is used to integrate spring with aop
public class AppConfig {

}
