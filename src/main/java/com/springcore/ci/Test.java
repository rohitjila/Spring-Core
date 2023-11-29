package com.springcore.ci;

import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("META-INF/ci_beans.xml");
        Person p = (Person)context.getBean("person");
        System.out.print(p);
    }
}
