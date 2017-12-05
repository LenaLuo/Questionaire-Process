package com.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QuestionaireProcess")
public class QuestionaireProcess{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="QPNumber")
	private Long qPNumber;
	
	@Column(name="QType")
	private String qType;
	
	@Column(name="QName")
	private String qName;
	
	@Column(name="CreatedAt")
	private Timestamp createdAt;
	
	@Column(name="CreatedBy")
	private String createdBy;
	
	@Column(name="ModifiedAt")
	private Timestamp modifiedAt;
	
	@Column(name="ModifiedBy")
	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getqPNumber() {
		return qPNumber;
	}

	public void setqPNumber(Long qPNumber) {
		this.qPNumber = qPNumber;
	}

	public String getqType() {
		return qType;
	}

	public void setqType(String qType) {
		this.qType = qType;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public QuestionaireProcess(Long id, Long qPNumber, String qType,
			String qName, Timestamp createdAt, String createdBy,
			Timestamp modifiedAt, String modifiedBy) {
		super();
		this.id = id;
		this.qPNumber = qPNumber;
		this.qType = qType;
		this.qName = qName;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}
	
	

	public QuestionaireProcess(Long qPNumber, String qType, String qName,
			Timestamp createdAt, String createdBy, Timestamp modifiedAt,
			String modifiedBy) {
		super();
		this.qPNumber = qPNumber;
		this.qType = qType;
		this.qName = qName;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
	}

	public QuestionaireProcess() {
		super();
	}
	
	

	public QuestionaireProcess(Long qPNumber, String qType) {
		super();
		this.qPNumber = qPNumber;
		this.qType = qType;
	}

	@Override
	public String toString() {
		return "QuestionaireProcess [id=" + id + ", qPNumber=" + qPNumber
				+ ", qType=" + qType + ", qName=" + qName + ", createdAt="
				+ createdAt + ", createdBy=" + createdBy + ", modifiedAt="
				+ modifiedAt + ", modifiedBy=" + modifiedBy + "]";
	}
	
	
}
