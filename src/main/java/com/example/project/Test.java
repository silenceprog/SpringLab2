package com.example.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println("Id user:" + user.getId());
        System.out.println("Username user:" + user.getUsername());
        System.out.println("Email user:" + user.getEmail());
        System.out.println("Task title:" + user.getTask().getTitle());
        System.out.println("Project name:" + user.getProject().getName());

        context.close();
    }
}
