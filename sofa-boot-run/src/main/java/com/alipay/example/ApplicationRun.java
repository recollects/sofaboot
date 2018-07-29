package com.alipay.example;

import com.alipay.sofa.runtime.spring.initializer.SofaRuntimeSpringContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author recollects
 * @date 2018年07月20日 下午12:20 
 * @version V1.0
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.alipay.example"})
public class ApplicationRun {

    /**
     * http://localhost:8080/sofaboot/versions
     * http://localhost:8080/health/readiness
     * http://localhost:8080/health/
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationRun.class);
        springApplication.addInitializers(new SofaRuntimeSpringContextInitializer());
        springApplication.run(args);
    }
}
