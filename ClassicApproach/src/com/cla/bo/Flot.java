package com.cla.bo;

public class Flot {
private int flot_nbr;
private String flot_type;
private String fashing;
private int sq_ft;
private int blok_no;
private int owner_no;
public int getFlot_nbr() {
	return flot_nbr;
}
public void setFlot_nbr(int flot_nbr) {
	this.flot_nbr = flot_nbr;
}
public String getFlot_type() {
	return flot_type;
}
public void setFlot_type(String flot_type) {
	this.flot_type = flot_type;
}
public String getFashing() {
	return fashing;
}
public void setFashing(String fashing) {
	this.fashing = fashing;
}
public int getSq_ft() {
	return sq_ft;
}
public void setSq_ft(int sq_ft) {
	this.sq_ft = sq_ft;
}
public int getBlok_no() {
	return blok_no;
}
public void setBlok_no(int blok_no) {
	this.blok_no = blok_no;
}
public int getOwner_no() {
	return owner_no;
}
public void setOwner_no(int owner_no) {
	this.owner_no = owner_no;
}
@Override
public String toString() {
	return "Flot [flot_nbr=" + flot_nbr + ", flot_type=" + flot_type + ", fashing=" + fashing + ", sq_ft=" + sq_ft
			+ ", blok_no=" + blok_no + ", owner_no=" + owner_no + "]";
}

}
