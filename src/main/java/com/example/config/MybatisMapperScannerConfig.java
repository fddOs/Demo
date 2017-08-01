package com.example.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 12402 on 2017/8/1.
 */
@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MybatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        // 指定xml配置文件的路径
        mapperScannerConfigurer.setBasePackage("com.example.mapper");
        return mapperScannerConfigurer;
    }
}
