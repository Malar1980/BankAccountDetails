package org.malar.service.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


public class AccountResponse implements Serializable {
 protected int id;
 protected String accname;
 protected long accnumber;
 protected String acctype;
 protected double accbalance;
 protected String acccreateddate,accupdateddate;
 protected String message;
	public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	public String getAcccreateddate() {
		return acccreateddate;
	}
	public void setAcccreateddate(String acccreateddate) {
		this.acccreateddate = acccreateddate;
	}
	public String getAccupdateddate() {
		return accupdateddate;
	}
	public void setAccupdateddate(String accupdateddate) {
		this.accupdateddate = accupdateddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
