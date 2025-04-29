package com.ies.service;

import java.util.List;

import com.ies.bindings.UserAccountForm;

public interface AccountService {
	
	
	public boolean createUserAccount(UserAccountForm acForm);
	
	public List<UserAccountForm> fetchUserAccounts();
	
	public UserAccountForm getUSerAccById(Integer AccId);
	
	public String changeAccStatus(Integer accId, String status);
	
	
	
	

}
