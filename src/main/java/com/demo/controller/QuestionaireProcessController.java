package com.demo.controller;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.QuestionaireProcess;
import com.demo.model.QuestionaireProcessRepository;

@RestController
@RequestMapping("/QuestionaireProcess")
public class QuestionaireProcessController {
	
	private QuestionaireProcessRepository questionaireProcessRepository;
	
	@Autowired 
	public QuestionaireProcessController(QuestionaireProcessRepository qProcessRepository){
		this.questionaireProcessRepository = qProcessRepository;
	}
	
	@GetMapping(value="/findall")
	public List<QuestionaireProcess > findAll(){
		return (List<QuestionaireProcess>) questionaireProcessRepository.findAll();
	}
	@GetMapping(value="/findbyId/{id}")   //Find By Id
	public QuestionaireProcess findById(@PathVariable("id") Long id){
		return questionaireProcessRepository.findOne(id);
	}
	@PostMapping(value="/create")
	public ResponseEntity<QuestionaireProcess> add(@RequestBody QuestionaireProcess questionaireProcess){
		questionaireProcess.setqPNumber(questionaireProcess.getqPNumber());
		questionaireProcess.setqType(questionaireProcess.getqType());
		questionaireProcess.setqName(questionaireProcess.getqName());
		questionaireProcess.setCreatedBy(questionaireProcess.getCreatedBy());
		questionaireProcess.setModifiedBy(questionaireProcess.getModifiedBy());
		questionaireProcess.setCreatedAt(new Timestamp(new Date().getTime()));//questionaireProcess.getCreatedAt()
		questionaireProcess.setModifiedAt(new Timestamp(new Date().getTime()));//questionaireProcess.getModifiedAt()
		QuestionaireProcess adquQuestionnaireProcess = questionaireProcessRepository.save(questionaireProcess);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<QuestionaireProcess>(adquQuestionnaireProcess, headers, HttpStatus.CREATED);
	}
	@PutMapping(value="update/{id}")
	public QuestionaireProcess updateById(@PathVariable("id") Long id, @RequestBody QuestionaireProcess updateQuestionaireProcess){
		updateQuestionaireProcess.setqPNumber(updateQuestionaireProcess.getqPNumber());
		updateQuestionaireProcess.setqType(updateQuestionaireProcess.getqType());
		updateQuestionaireProcess.setqName(updateQuestionaireProcess.getqName());
		updateQuestionaireProcess.setCreatedBy(updateQuestionaireProcess.getCreatedBy());
		updateQuestionaireProcess.setModifiedBy(updateQuestionaireProcess.getModifiedBy());
		updateQuestionaireProcess.setCreatedAt(new Timestamp(new Date().getTime()));//updateQuestionaireProcess.getCreatedAt()
		updateQuestionaireProcess.setModifiedAt(new Timestamp(new Date().getTime()));//updateQuestionaireProcess.getModifiedAt()
		return questionaireProcessRepository.save(updateQuestionaireProcess);
	}
	@DeleteMapping(value="/deleteById/{id}")
	public void deleteById(@PathVariable("id") Long id){
		questionaireProcessRepository.delete(id);
	}
	
	@DeleteMapping(value="/deleteAll")
	public void deleteAll(){
		questionaireProcessRepository.deleteAll();
	}
	
	
}
