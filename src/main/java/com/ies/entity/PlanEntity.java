package com.ies.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PlanEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer planId;
	private String planName;
	private String planCategory;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private String planActiveStatus = "ACTIVE";
	
	//private Integer createdBy;
	private Integer updatedBy;
	
	@CreationTimestamp
	@Column(updatable = false, nullable = false)
	private LocalDate createDate;
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userId;

}
