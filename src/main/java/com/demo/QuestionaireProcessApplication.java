package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.demo.model.QuestionaireProcess;
import com.demo.model.QuestionaireProcessRepository;

@SpringBootApplication
//(exclude={HibernateJpaAutoConfiguration.class})
public class QuestionaireProcessApplication{
//	@Autowired
//	private QuestionaireProcessRepository questionaireProcessRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(QuestionaireProcessApplication.class, args);
	}
	
//	@Override
//	public void run(String... args) throws Exception {
////		questionaireProcessRepository.save(new QuestionaireProcess((long) 00001,"Test"));
////		questionnaireRepository.save(new Questionnaire((long) 00001,"test"));
////		System.out.println(questionnaireRepository.findAll());
//	}
}
