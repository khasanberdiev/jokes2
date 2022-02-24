package com.example.jokes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{


    @PostConstruct
    public void doInit(){
        System.out.println("Perform init");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("do distroy");
    }

    public String[] getSong(){
        String[] st=new String[3];
        st[0]="this is the first classic";
        st[1]="this is the second classic";
        st[2]="this is the third classic";

        return st;
    }
}
