package com.nishchay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Dev dev = (Dev) context.getBean("dev");
        dev.build();
        System.out.println(dev.getAge());
    }
}
