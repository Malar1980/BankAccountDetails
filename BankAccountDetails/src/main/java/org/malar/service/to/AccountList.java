package org.malar.service.to;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountList")
public class AccountList {
	
	
	
	
	    @XmlElement(name = "AccountResponse")
	    protected List<AccountResponse> accountResponse;
	    public List<AccountResponse> getAccountList() {
	        if (accountResponse == null) {
	        	accountResponse = new ArrayList<AccountResponse>();
	        }
	        return this.accountResponse;
	    }
	}
