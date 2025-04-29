package com.ies.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class COEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noticeId;
	private Integer caseId;
	private Integer edId;
	private String pdfUrl;
	private String noticeStatus = "PENDING";
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@OneToOne
	@JoinColumn(name="ed_Trace_Id")
	private EligibilityDetermination eliTrno;

}
