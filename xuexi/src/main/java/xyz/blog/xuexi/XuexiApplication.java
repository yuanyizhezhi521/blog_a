package xyz.blog.xuexi;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.blog.xuexi.dao")
public class XuexiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuexiApplication.class, args);
    }

}
