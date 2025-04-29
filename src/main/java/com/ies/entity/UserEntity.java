package com.ies.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String fullName;
	private String userEmail;
	private String userPwd;
	private Long userPhno;
	private String userGender;
	private LocalDate userDob;
	private Integer userSsn;
	private String accountStatus = "LOCKED";
	private String activeSw = "ACTIVE";
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	private Integer createdBy;
	private Integer updatedBy;
	
	private Integer userRole;
	
	@OneToMany (mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<PlanEntity> plans;
	
	@OneToMany(mappedBy = "userId")
	private List<CitizenAppEntity> citizens;
	
	

}
