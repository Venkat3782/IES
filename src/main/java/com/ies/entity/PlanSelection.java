package com.ies.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PlanSelection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planSelectionId;
	private Integer planName;
	
	@OneToOne
	@JoinColumn(name="case-Num")
	private CitizenAppEntity cpNum;

}
