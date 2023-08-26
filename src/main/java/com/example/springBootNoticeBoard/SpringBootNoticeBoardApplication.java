package com.example.springBootNoticeBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootNoticeBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNoticeBoardApplication.class, args);
	}

}
