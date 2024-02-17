package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("com.atguigu.ioc_01")
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class JavaConfiguration {
    @Value("${atguigu.url}")
    private String Url;
    @Value("${atguigu.driver}")
    private String DriverClassName;
    @Value("${atguigu.username}")
    private String UserName;
    @Value("${atguigu.password}")
    private String Password;

    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(Url);
        druidDataSource.setDriverClassName(DriverClassName);
        druidDataSource.setUsername(UserName);
        druidDataSource.setPassword(Password);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);
        return jdbcTemplate;
    }
}
