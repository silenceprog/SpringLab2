package com.example.project;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Project {
    @Value("1")
    private Long id;
    @Value("new project")
    private String name;

    public Project(){
        System.out.println("Project been created");
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
