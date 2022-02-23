package com.example.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Alien {
    private int iId;
    private String aName;

    @Autowired
    private Laptop laptop;

    public void show(){
        laptop.compile();
    }

    public Alien(){

    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

   
    public Alien(int iId, String aName) {
        this.iId = iId;
        this.aName = aName;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
    
}
