package com.springbok.ioc.injection;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbok.ioc.injection.CollectionBean;

public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");
        CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
        Map<String, String> addressList = bean.getAddressList();
        for (String address : addressList.values()) {
            System.out.println(address.toString());
        }
        factory.close();
    }
}
