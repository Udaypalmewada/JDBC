package com.cla.bo;

public class Block {
	private int blok_nbr;
	private String blok_name;
	private int capacity;
	private String zone;

	public int getBlockno() {
		return blok_nbr;
	}

	public void setBlockno(int blockno) {
		this.blok_nbr = blockno;
	}

	public String getBlocknm() {
		return blok_name;
	}

	public void setBlocknm(String blocknm) {
		this.blok_name = blocknm;
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
		return "Block [blockno=" + blok_nbr + ", blocknm=" + blok_name + ", capacity=" + capacity + ", zone=" + zone
				+ "]";
	}

}
