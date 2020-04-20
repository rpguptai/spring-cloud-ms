package com.versh.app.intercomm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.versh.app.model.Account;

@Component
public class AccountFallback implements AccountClient {

	@Override
	public List<Account> getAccounts(Integer customerId) {
		System.out.println(" FALLBACK>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
		List<Account> acc = new ArrayList<Account>();
		return acc;
	}
	
}