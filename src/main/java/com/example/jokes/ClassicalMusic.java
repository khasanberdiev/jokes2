package com.example.jokes;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public String getSong(){
        return "this is classic music";
    }
}
