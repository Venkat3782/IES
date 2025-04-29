package com.ies.service;

import org.springframework.stereotype.Service;

import com.ies.bindings.DashBoardCards;
import com.ies.bindings.LoginForm;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recoverPwd(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashBoardCards fetchDashboardInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
