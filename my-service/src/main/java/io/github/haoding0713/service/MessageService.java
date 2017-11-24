package io.github.haoding0713.service;

import io.github.haoding0713.service.base.AbstractService;
import org.springframework.util.StringUtils;

public abstract class MessageService implements AbstractService {

    public abstract String greeting(String name);

    public void callback(final String message){

        if(StringUtils.hasText(message)){
            System.out.println(message);
        } else{
            System.out.println("    Unified Callback point for all Service !");
        }
    }
}
