package io.github.haoding0713.example;

import org.springframework.util.StringUtils;

public abstract class MessageService implements AbstractService{

    public abstract String greeting(String name);

    public void callback(final String message){

        if(StringUtils.hasText(message)){
            System.out.println(message);
        } else{
            System.out.println("    Unified Callback point for all Service !");
        }
    }
}
