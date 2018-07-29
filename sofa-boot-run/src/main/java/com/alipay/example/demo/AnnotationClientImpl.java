package com.alipay.example.demo;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.stereotype.Component;

/**
 *
 * @author recollects
 * @date 2018年07月25日 上午9:19 
 * @version V1.0
 *
 */
@Component
public class AnnotationClientImpl {
    @SofaReference(interfaceType = AnnotationService.class, jvmFirst = false, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private AnnotationService annotationService;

    public String sayClientAnnotation(String str) {

        String result = annotationService.sayAnnotation(str);

        return result;
    }
}
