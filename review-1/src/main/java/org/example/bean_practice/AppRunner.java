package org.example.bean_practice;

import org.example.bean_practice.FullTimeEmployee;
import org.example.bean_practice.PartTimeEmployee;
import org.example.bean_practice.config.EmployeeConfig;


import org.example.bean_practice.config.RandomBean;
import org.example.stereotype_annotations.config.HoursConfig;
import org.example.stereotype_annotations.model.DataStructure;
import org.example.stereotype_annotations.model.Devops;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class, RandomBean.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

        //    String str1= container.getBean("abc",String.class);

        String str = container.getBean("abc", String.class);
        System.out.println(str);

        String str2 = container.getBean("str2", String.class);

        System.out.println(str2);



    }
}