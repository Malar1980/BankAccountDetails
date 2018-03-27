package org.malar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	
	@Id
	// @GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "ACC_NAME")
	private String accname;
	@Column(name = "ACC_NUMBER")
	private long accnumber;
	@Column(name = "ACC_TYPE")
	private String acctype;
	@Column(name = "ACC_CREATEDDATE")
	private String acccreateddate;
	@Column(name = "ACC_UPDATEDDATE")
	private String accupdateddate;
	@Column(name="ACC_BALANCE")
	private double accbalance;
	
	public double getAccbalance() {
		return accbalance;
	}


	public Account(int id, String accname, long accnumber, String acctype, String acccreateddate, String accupdateddate,
			double accbalance) {
		super();
		this.id = id;
		this.accname = accname;
		this.accnumber = accnumber;
		this.acctype = acctype;
		this.acccreateddate = acccreateddate;
		this.accupdateddate = accupdateddate;
		this.accbalance = accbalance;
	}


	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}


	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
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

	

	public Account() {

	}

	

}
