package com.cla.bo;

public class Owner {
private int ownerno;
private String ownerName;
private String lastname;
private String dob;
private String mobile;
private String email;

public int getOwnerno() {
	return ownerno;
}
public void setOwnerno(int ownerno) {
	this.ownerno = ownerno;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Owner [ownerno=" + ownerno + ", ownerName=" + ownerName + ", lastname=" + lastname + ", dob=" + dob
			+ ", mobile=" + mobile + ", email=" + email + "]";
}


}
