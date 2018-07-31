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

        AnnotationServiceImpl annotationService = applicationContext.getBean(AnnotationServiceImpl.class);

        String result = annotationService.sayAnnotation("annotation");
        System.out.println("invoke result:" + result);

        if ("annotation".equalsIgnoreCase(result)) {
            System.out.println("annotation invoke success");
        } else {
            System.out.println("annotation invoke fail");
        }
    }
}
