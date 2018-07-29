package com.alipay.example.service.impl;

import com.alipay.example.service.SampleService;
import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ServiceClient;
import com.alipay.sofa.runtime.api.client.param.ServiceParam;

/**
 *
 * @author recollects
 * @date 2018年07月20日 下午12:18 
 * @version V1.0
 *
 */
public class PublishServiceWithClient implements ClientFactoryAware {

    private ClientFactory clientFactory;

    public void init() {
        ServiceClient serviceClient = clientFactory.getClient(ServiceClient.class);
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setInstance(new SampleServiceImpl());
        serviceParam.setInterfaceType(SampleService.class);
        serviceParam.setUniqueId("serviceClientImpl");
        serviceClient.service(serviceParam);
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}
