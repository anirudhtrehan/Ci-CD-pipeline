package com.example.demo;

public class edata {
private int eid;
private String ename;
private String dept;
private int sal;
public edata(int eid, String ename, String dept, int sal) {
	this.eid = eid;
	this.ename = ename;
	this.dept = dept;
	this.sal = sal;
}
public edata() {}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "edata [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + "]";
}

}
