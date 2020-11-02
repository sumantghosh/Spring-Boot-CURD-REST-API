package com.demoproject.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class Branch
{
@Id
@Column
private int branchid;
@Column
private int businessid;
@Column
private String branchaddress;
@Column
private long branchcontact;
@Column
private String activeind;
@Column
private LocalDate createddate;
@Column
private LocalDate updateddate;
public int getBranchid() {
	return branchid;
}
public void setBranchid(int branchid) {
	this.branchid = branchid;
}
public int getBusinessid() {
	return businessid;
}
public void setBusinessid(int businessid) {
	this.businessid = businessid;
}
public String getBranchaddress() {
	return branchaddress;
}
public void setBranchaddress(String branchaddress) {
	this.branchaddress = branchaddress;
}
public long getBranchcontact() {
	return branchcontact;
}
public void setBranchcontact(long branchcontact) {
	this.branchcontact = branchcontact;
}
public String getActiveind() {
	return activeind;
}
public void setActiveind(String activeind) {
	this.activeind = activeind;
}
public LocalDate getCreateddate() {
	return createddate;
}
public void setCreateddate(LocalDate createddate) {
	this.createddate = createddate;
}
public LocalDate getUpdateddate() {
	return updateddate;
}
public void setUpdateddate(LocalDate updateddate) {
	this.updateddate = updateddate;
}
}
