package com.ies.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.jackson.JsonComponent;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CitizenAppEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseNum;
	private String fullName;
	private String email;
	private Long phno;
	private String gender;
	private LocalDate dob;
	private String ssn;
	
	private String city;
	private String houseNum;
	private String state;
	
	
	private Integer createdBy;
	
	@CreationTimestamp
	private LocalDate createDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userId;
	
	@OneToOne(mappedBy = "cpNum", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private PlanSelection pselect;
	
	@OneToOne(mappedBy = "ceNum", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private EducationDetails edu;
	
	@OneToOne(mappedBy = "ciNum", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private IncomeDetails income;
	
	@OneToMany
	private List<KidsEntity> kids;
	
	@OneToOne(mappedBy = "cedNum", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private EligibilityDetermination eDtermination;
	

}
