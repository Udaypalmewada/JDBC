package com.qaap.bo;

public class Block {
private int block_nbr;
private String block_name;
private int capacity;
private String zone;
public int getBlock_nbr() {
	return block_nbr;
}
public void setBlock_nbr(int block_nbr) {
	this.block_nbr = block_nbr;
}
public String getBlock_name() {
	return block_name;
}
public void setBlock_name(String block_name) {
	this.block_name = block_name;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String getZone() {
	return zone;
}
public void setZone(String zone) {
	this.zone = zone;
}
@Override
public String toString() {
	return "Block [block_nbr=" + block_nbr + ", block_name=" + block_name + ", capacity=" + capacity + ", zone=" + zone
			+ "]";
}

}
