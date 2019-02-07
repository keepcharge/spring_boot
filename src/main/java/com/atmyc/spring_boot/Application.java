package com.atmyc.spring_boot;

import com.atmyc.spring_boot.config.DBConfig1;
import com.atmyc.spring_boot.config.DBConfig2;
import com.atmyc.spring_boot.datasource.DataSource01;
import com.atmyc.spring_boot.datasource.DataSource02;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling  //开启定时任务
@EnableAsync
@EnableCaching  //开启缓存
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.atmyc.spring_boot.*"})
@MapperScan(value = {"com.atmyc.spring_boot.dao","com.atmyc.spring_boot.test01.dao","com.atmyc.spring_boot.test02.dao"})
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@Import({
        DataSource01.class ,DataSource02.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

