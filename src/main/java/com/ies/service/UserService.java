package com.ies.service;

import com.ies.bindings.DashBoardCards;
import com.ies.bindings.LoginForm;

public interface UserService {
	
	public String login(LoginForm loginForm);
	
	public boolean recoverPwd(String email);
	
	public DashBoardCards fetchDashboardInfo();

}
