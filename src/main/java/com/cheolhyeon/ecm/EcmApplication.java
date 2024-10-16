package com.cheolhyeon.ecm;

import com.cheolhyeon.ecm.userapi.config.MailgunConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableFeignClients
@SpringBootApplication
public class EcmApplication {
    public static void main(String[] args) {
        SpringApplication.run(EcmApplication.class, args);
    }
}
