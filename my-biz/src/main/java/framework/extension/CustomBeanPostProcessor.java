package framework.extension;

import io.github.haoding0713.service.base.AbstractService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered{

    private int order = 0;


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof AbstractService) {
            System.out.println("[Service]: " + beanName + " found !");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof AbstractService) {
            ((AbstractService) bean).callback(null);
            System.out.println("[Service]: " + beanName + " created !");
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return this.order;
    }
}
