package org.example.stereotype_annotations;

import org.example.stereotype_annotations.config.HoursConfig;
import org.example.stereotype_annotations.model.DataStructure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(HoursConfig.class);


        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();
    }
}
