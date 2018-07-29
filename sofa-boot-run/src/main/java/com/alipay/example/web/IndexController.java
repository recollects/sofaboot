package com.alipay.example.web;

import com.alipay.example.service.SampleService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author recollects
 * @date 2018年07月23日 下午7:11 
 * @version V1.0
 *
 */
@RestController
public class IndexController {

    @SofaReference(binding = @SofaReferenceBinding(bindingType = "bolt"))
    private SampleService sampleService;

    /**
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "success" + sampleService.message();
    }

}
