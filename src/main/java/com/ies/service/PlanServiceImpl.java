package com.ies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ies.bindings.PlanForm;

@Service
public class PlanServiceImpl implements PlanService {

	@Override
	public boolean createPlan(PlanForm planform) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PlanForm> fetchPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanForm getPlanById(Integer planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePlanaStatus(Integer planId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
