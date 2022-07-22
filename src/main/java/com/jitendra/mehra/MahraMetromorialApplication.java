package com.jitendra.mehra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jitendra.mehra.upload.stroage.StorageService;

@SpringBootApplication
public class MahraMetromorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MahraMetromorialApplication.class, args);
	}
	
	
	@Autowired
	StorageService storageService;
	
	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
	 
}
