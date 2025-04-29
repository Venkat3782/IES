package com.ies.service;

import java.util.List;

import com.ies.bindings.PlanForm;

public interface PlanService {
	
	public boolean createPlan(PlanForm planform);
	
	public List<PlanForm> fetchPlans();
	
	public PlanForm getPlanById(Integer planId);
	
	public String changePlanaStatus (Integer planId,String status);
	
	
	
	
	

}
