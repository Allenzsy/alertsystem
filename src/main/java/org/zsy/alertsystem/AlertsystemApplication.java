package org.zsy.alertsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.zsy.alertsystem.mapper")
public class AlertsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlertsystemApplication.class, args);
    }

}
