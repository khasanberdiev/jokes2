package com.example.jokes;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lId;
    private String lName;

    public Laptop(){

    }

    public void compile(){
        System.out.println("in laptop");
    }

    public Laptop(int lId, String lName) {
        this.lId = lId;
        this.lName = lName;
    }

    public int getlId() {
        return lId;
    }
    public void setlId(int lId) {
        this.lId = lId;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
}
