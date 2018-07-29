package com.alipay.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author recollects
 * @date 2018年07月25日 上午9:19 
 * @version V1.0
 *
 */
@SpringBootApplication
public class AnnotationServerApplication {
    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(AnnotationServerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
