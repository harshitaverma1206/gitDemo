package com.yash.model;

public class EmployeeRecord {
	private int id;
	private String name;
    private int salary;
	private String address;
	private String department;

	//creating constructor 
 public EmployeeRecord(int id ,String name,int salary,String address,String department) {
	super();
	 this.id=id;
	 this.name=name;
	 this.salary=salary;
	 this.address=address;
	 this.department=department;
 }
 public EmployeeRecord() {
	 
 }
 public int getId() {
	 return id;
 }
 public void setId(int id) {
	 this.id=id;
 }
 public String getName() {
	 return name;
 }
public void setName(String name) {
	this.name=name;
}
 
 public int getSalary() {
	 return salary;
 }
 public void setSalary(int salary) {
	 this.salary=salary;
 }
 
 public String getAddress() {
	 return address;
 }
 public void setAddress(String address) {
	 this.address=address;
 }
 
 public String getDepartment() {
	 return department;
 }
 public void setDepartment(String department) {
	 this.department=department;
 }
 
 public String toString() {
		return "employee[ id=" + id + ",name=" + name +",salary="+salary+",address="+address+",department="+department+"]";
	}

}



