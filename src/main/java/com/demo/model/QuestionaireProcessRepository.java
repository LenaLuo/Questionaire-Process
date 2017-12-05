package com.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionaireProcessRepository extends CrudRepository<QuestionaireProcess, Long>{

}
