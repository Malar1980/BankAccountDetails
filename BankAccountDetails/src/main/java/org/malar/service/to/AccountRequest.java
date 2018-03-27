package org.malar.service.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AccountRequest")
public class AccountRequest implements Serializable {
 private int id;
	private String accname;
	private long accnumber;
	private String acctype;
	private double accbalance;
	private String acccreateddate,accupdateddate;
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
	/*public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}*/
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
