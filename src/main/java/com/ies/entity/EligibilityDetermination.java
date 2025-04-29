package com.ies.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ED_Elg_Details")
public class EligibilityDetermination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	private Integer edTraceId;
	private String planName;
	private String planStatus;
	private LocalDate elgStartDate;
	private LocalDate elgEndDate;
	private Integer benfitAmount;
	private String denialReason;
	
	@CreationTimestamp
	private LocalDate createDate;
	
	@OneToOne
	@JoinColumn(name="case_Num")
	private CitizenAppEntity cedNum;
	
	@OneToOne
	private COEntity eliTrno;
}
