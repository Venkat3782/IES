package com.ies.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DC_Income")
public class IncomeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	private Integer monthlySalaryIncome;
	private Integer rentIncome;
	private Integer propertyIncome;
	
	@OneToOne
	@JoinColumn(name="case_num")
	private CitizenAppEntity ciNum;
	
	

}
