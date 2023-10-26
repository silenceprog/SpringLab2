package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {
    @Value("1")
    private Long id;
    @Value("sil_cut")
    private String username;
    @Value("sil@gmail.com")
    private String email;
    private Project project;
    private Task task;

    @PostConstruct
    public void init(){
        System.out.println("Class User: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class User: destroy method");
    }

    @Autowired
    public User(Project project,Task task){
        System.out.println("User been created");
        this.project = project;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
