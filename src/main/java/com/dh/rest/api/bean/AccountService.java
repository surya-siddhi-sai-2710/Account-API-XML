package com.dh.rest.api.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Service;

import com.dh.rest.api.model.Account;

@Service("accountService")
public class AccountService {
	
			public void getResponseForAccount(Exchange exchange) throws Exception{
		
				Message oMessage = exchange.getIn();
				Account oAccount = oMessage.getBody(Account.class);
				System.out.println(oAccount.toString());
			}
}