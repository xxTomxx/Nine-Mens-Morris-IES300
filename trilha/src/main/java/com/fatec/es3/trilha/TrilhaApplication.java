package com.fatec.es3.trilha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.es3.trilha.data.dao.UserDao;

@SpringBootApplication
public class TrilhaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserDao repository;

	public static void main(String[] args) {
		SpringApplication.run(TrilhaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Running");
		logger.info("{}", repository.findAll());
	}

}
