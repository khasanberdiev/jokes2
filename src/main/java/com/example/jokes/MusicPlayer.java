package com.example.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    private int volume=0;
    private String name="kikosam";

  
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // public MusicPlayer(Music music, int volume, String name) {
    //     this.music = music;
    //     this.volume = volume;
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    public void playMusic(){
        String arr[]=music.getSong();
        System.out.println(music.getSong());
        for (int i=0; i<=arr.length-1; i++ ){
            System.out.println("playing"+arr[i]);
        }
        
    }


}
