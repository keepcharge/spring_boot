package com.atmyc.spring_boot.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mysql.datasource.test2")
public class DBConfig2 {

    private String url;
    private String username;
    private String password;
    private Integer minPoolSize;
    private Integer maxPoolSize;
    private Integer maxLifetime;
    private Integer borrowConnectionTimeout;
    private Integer loginTimeout;
    private Integer maintenanceInterval;
    private Integer maxIdleTime;
    private String testQuery;
}
