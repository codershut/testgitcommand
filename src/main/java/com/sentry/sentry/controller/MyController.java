package com.sentry.sentry.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


	public static final Logger log = LogManager.getLogger(MyController.class);

	
	@GetMapping("/api")
	public String myFun() {
		try {
			log.info("FIRST CHECK");
			return "Here we go";
		} catch (Exception e) {
			log.info("got exception");
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/testapi")
	public String myFunapi() {
		try {
			log.info("FIRST CHECK");
			return "Here we go";
		} catch (Exception e) {
			log.info("got exception");
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		
		String str="<data><panCard>MSMPS3085B</panCard><totalDue>null</totalDue><mid>10115</mid><rapiPayDebitAmount>561.0</rapiPayDebitAmount><rapiPayDebitDate>27 September 2022</rapiPayDebitDate><createdOn>2022-09-27 12:37:21.623</createdOn><rapipayTxnID>183645</rapipayTxnID><lmsApiStatus>200</lmsApiStatus><charges>null</charges><emiActualAmt>365.54</emiActualAmt><emiDueDate>2022-09-23 00:00:00.0</emiDueDate><loanStatus>Active</loanStatus><emiDue>4771.62</emiDue><isPartial>true</isPartial><nbfcCode>TRANSACTREE</nbfcCode><rapiPayStatus>200</rapiPayStatus><loanId>TRANSACTREE21574</loanId><txnid>DEBITTRANSACTREE2157420220923</txnid></data><message>Triggered LMS</message><status>true</status>";
		System.err.println(XML.toJSONObject(str));
		
		
		
	}
	
}