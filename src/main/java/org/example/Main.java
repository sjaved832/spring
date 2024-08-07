package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       // BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();
        Triangle point = (Triangle) context.getBean("triangle");
        point.draw();


    }
}