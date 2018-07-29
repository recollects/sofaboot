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
public class AnotationClientApplication {
    public static void main(String[] args) {

        //change port to run in local machine
        System.setProperty("server.port", "8081");

        SpringApplication springApplication = new SpringApplication(AnotationClientApplication.class);

        ApplicationContext applicationContext = springApplication.run(args);

        AnnotationClientImpl annotationService = applicationContext.getBean(AnnotationClientImpl.class);

        String result = annotationService.sayClientAnnotation("annotation");
        System.out.println("invoke result:" + result);

        if ("annotation".equalsIgnoreCase(result)) {
            System.out.println("annotation invoke success");
        } else {
            System.out.println("annotation invoke fail");
        }
    }
}
