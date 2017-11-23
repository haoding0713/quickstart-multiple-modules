package io.github.haoding0713;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LazyObject implements InitializingBean, DisposableBean {

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


    /**
     * According to output, these methods are executed in below order:
     *
     * InitializingBean#afterPropertiesSet()
     *
     * init-method#init()
     *
     * DisposableBean#destroy()
     *
     * destory-method#cleanUp()
     */
    public void init(){
        System.out.println("Programmatically Init LazyObject !");
    }

    public void cleanUp() {
        System.out.println("Programmatically Clean Up LazyObject !");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Triggered By DisposableBean LifeCycle !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Triggered By InitializingBean LifeCycle !");
    }
}
