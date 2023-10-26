package com.example.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Task task1 = context.getBean("task", Task.class);
        Task task2 = context.getBean("task", Task.class);
        System.out.println("Змінні посилаються на один і той обєкт? " + (task1 == task2));
        System.out.println(task1);
        System.out.println(task2);
    }
}
