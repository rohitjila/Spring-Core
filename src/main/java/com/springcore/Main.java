package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/office_beans.xml");
//        Student student1 = (Student) context.getBean("student1");
          Office employees1 = (Office) context.getBean("employees1");

        System.out.println(employees1.getEmployees());
        System.out.println(employees1.getEmployeesId());
        System.out.println(employees1.getProps());
        System.out.println(employees1.getEmployeesDesignationAndName());

//        System.out.println(student1);
//        System.out.println(student1.getStudentId());
//        System.out.println(student1.getStudentAddress());
//        System.out.println(student1.getStudentName());


        //to start with spring core configuration we have to follow 6 steps
        //Create maven project
        //Adding dependencies => spring core , spring context(of same version)
        //creating beans-java pojo
        //setter Injection
        //Main class which can pull the object and use
    }
}