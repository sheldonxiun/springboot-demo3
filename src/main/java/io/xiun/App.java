package io.xiun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"io.xiun"})
@MapperScan(basePackages = {"io.xiun.mapper"})
//@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
