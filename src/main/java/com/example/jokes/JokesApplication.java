package com.example.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JokesApplication.class, args);
		MusicPlayer a=context.getBean(MusicPlayer.class);
		a.playMusic();
		System.out.println("00000000000000000000000000000");
		context.close();

		
	}

}
