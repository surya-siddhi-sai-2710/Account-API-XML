package com.dh.rest.api.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.dh.rest.api.model.Account;

@Component
public class AccountRouteBuilder extends RouteBuilder{
	
	@Override
	public void configure() throws Exception{
		
		restConfiguration().bindingMode(RestBindingMode.auto);
		
		rest("/account").post("/view/account").type(Account.class).consumes("application/xml").produces("application/xml")
		.to("direct:invoke-request");
		
		from("direct:invoke-request")
		.log("log1")
		.marshal().jacksonXml()
		.log("${body}")
		.to("https://598607a1-3e81-406b-b947-19d51484e356.mock.pstmn.io/api/account/view/account?bridgeEndpoint=true")		//calling DB endpoint
		.log("log2")
		.log("${body}")
		 .to("bean:accountService?method=getResponseForAccount")
		 .log("log3");
	}
}
