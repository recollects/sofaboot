package com.alipay.example.demo;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Component;

/**
 *
 * @author recollects
 * @date 2018年07月25日 上午9:20 
 * @version V1.0
 *
 */
@SofaService(interfaceType = AnnotationService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Component
public class AnnotationServiceImpl implements AnnotationService{
    @Override
    public String sayAnnotation(String stirng) {
        return stirng;
    }
}
