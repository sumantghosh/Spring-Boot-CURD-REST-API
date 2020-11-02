package com.demoproject.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class Business
{
@Id
@Column
private int businessid;
@Column
private String businessname;
@Column
private long contactno;
@Column
private String pan;
@Column
private LocalDate createddate;
@Column
private LocalDate updateddate;
public int getBusinessid() {
	return businessid;
}
public void setBusinessid(int businessid) {
	this.businessid = businessid;
}
public String getBusinessname() {
	return businessname;
}
public void setBusinessname(String businessname) {
	this.businessname = businessname;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
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