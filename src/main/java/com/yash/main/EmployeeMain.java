package com.yash.main;
import com.yash.model.EmployeeRecord;
import com.yash.serviceimpl.EmployeeServiceImpl;

public class EmployeeMain {
    static EmployeeRecord er[]=new EmployeeRecord[5];
    public static void main(String[] args) {
    	EmployeeServiceImpl f=new EmployeeServiceImpl();
		f.getAllEmployee();
		f.getmenu();
		f.goodbye();
		
		
		
    }
}
    	
    	