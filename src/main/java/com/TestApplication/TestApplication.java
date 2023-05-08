package com.TestApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
	
	
	public static final Logger logger= LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		
		logger.info("its contis integration build and test");
		SpringApplication.run(TestApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("it is sec log");
		
	}

}
     
 