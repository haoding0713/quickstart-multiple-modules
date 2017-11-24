package io.github.haoding0713;

import io.github.haoding0713.service.MessageService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyIOC {


    public static void main(String[] args) {

        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:applicationContext.xml"});

        System.out.println("--- Spring Container started !! ---");
        System.out.println();


        final MessageService ms = (MessageService) context.getBean("messageService");

        System.out.println(ms.greeting("Spring Master"));
        System.out.println();

        final LazyObject lazyObject = (LazyObject) context.getBean("lazyObject");
        System.out.println("[OUTPUT]" + lazyObject.getName());

        context.registerShutdownHook();
        System.out.println("Main App runs here $$$");
    }
}
