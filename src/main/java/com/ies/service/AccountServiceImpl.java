package com.ies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ies.bindings.UserAccountForm;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public boolean createUserAccount(UserAccountForm acForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserAccountForm> fetchUserAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAccountForm getUSerAccById(Integer AccId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeAccStatus(Integer accId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
