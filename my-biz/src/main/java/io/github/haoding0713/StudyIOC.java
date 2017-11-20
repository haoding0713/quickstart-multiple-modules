package io.github.haoding0713;

import io.github.haoding0713.example.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyIOC {


    public static void main(String[] args) {

        final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:applicationContext.xml"});

        System.out.println("Spring Container started !!");


        final MessageService ms = (MessageService) context.getBean("messageService");

        System.out.println(ms.greeting("Spring Master"));
    }
}
