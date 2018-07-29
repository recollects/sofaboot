package com.alipay.example.service.impl;

import com.alipay.example.service.SampleService;
import com.alipay.sofa.runtime.api.annotation.SofaService;

/**
 *
 * @author recollects
 * @date 2018年07月20日 下午12:17 
 * @version V1.0
 *
 */
@SofaService(uniqueId = "annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleService {

    @Override
    public String message() {
        return "annotationImpl";
    }
}
