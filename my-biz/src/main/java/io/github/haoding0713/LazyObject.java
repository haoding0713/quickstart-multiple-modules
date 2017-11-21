package io.github.haoding0713;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LazyObject implements InitializingBean {

    public LazyObject(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void init(){
        System.out.println("Init LazyObject !");
    }

    public void destroy() throws Exception {
        System.out.println("Destroy LazyObject !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set LazyObject ~");
    }
}
