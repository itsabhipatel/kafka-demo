package com.example.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
		try {


			System.out.println("Hello");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
