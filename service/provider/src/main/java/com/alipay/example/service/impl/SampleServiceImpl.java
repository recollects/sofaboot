package com.alipay.example.service.impl;

import com.alipay.example.service.SampleService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Service;

/**
 *
 * @author recollects
 * @date 2018年07月20日 下午12:07 
 * @version V1.0
 *
 */
@SofaService(bindings = @SofaServiceBinding(bindingType = "bolt"))
@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String message() {
        return "hello sofa";
    }
}
