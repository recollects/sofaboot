package com.alipay.example.test;

import com.alipay.example.service.SampleService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author recollects
 * @date 2018年07月20日 下午12:22 
 * @version V1.0
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SofaBootWithModulesTest {


    @SofaReference
    private SampleService sampleService;

    @SofaReference(uniqueId = "annotationImpl")
    private SampleService sampleServiceAnnotation;

    @SofaReference(uniqueId = "serviceClientImpl")
    private SampleService serviceClientImpl;

    @Test
    public void test() {
        sampleService.message();
//        sampleServiceAnnotation.message();
//        serviceClientImpl.message();
    }
}
