package com.example.jokes;

import org.springframework.stereotype.Component;

@Component

public class RockMusic implements Music{

    
    
    public String[] getSong(){
        String[] st=new String[3];
        st[0]="this is the first rock";
        st[1]="this is the second rock";
        st[2]="this is the third rock";


        return st;
    }

    
}
