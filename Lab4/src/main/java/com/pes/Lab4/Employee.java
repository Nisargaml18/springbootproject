package com.pes.Lab4;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String city;
	private long pin;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String city, long pin) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.pin = pin;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getename() {
		return ename;
	}
	public void setEName(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPin() {
		return pin;
	}
	public void setPhone(long pin) {
		this.pin =pin;
	}
}
