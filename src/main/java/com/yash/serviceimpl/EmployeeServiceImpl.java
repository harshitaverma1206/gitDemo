package com.yash.serviceimpl;
import java.util.Scanner;
import java.util.Set;

import com.yash.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import com.yash.model.EmployeeRecord;


public class EmployeeServiceImpl implements EmployeeService {
	public static ArrayList<EmployeeRecord> createListofemployee(){
	
	ArrayList<EmployeeRecord> emp = new ArrayList<EmployeeRecord>();
	emp.add(new EmployeeRecord(1,"jhon",24355,"pune","cs"));
	emp.add(new EmployeeRecord(2,"andrew",436257,"mumbai","ec"));
	emp.add(new EmployeeRecord(3,"andy",21653,"indore","el"));
	emp.add(new EmployeeRecord(4,"zoya",576755,"heydrabad","account"));
	return emp;
		
	}
	
	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		ArrayList<EmployeeRecord>list=createListofemployee();
		System.out.println(list);
		
		Iterator value = list.iterator();
		  
        // Displaying the values after iterating through the iterator
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
	}	
    public void getEmployeeById() {
    		ArrayList<EmployeeRecord> list=createListofemployee();
    		Scanner sc=new Scanner(System.in);
    		//Scanner sc1=new Scanner(System.in);
    		try{boolean found=false;
    		System.out.println("enter id to search");
    		 int id = sc.nextInt();
    		System.out.println("--------------------------");
    		 Iterator<EmployeeRecord> i = list.iterator();
    		while(i.hasNext()) {
    			EmployeeRecord e=i.next();
    			if(e.getId()==id) {
    			System.out.println(e);
    			found=true;	}		
    	 }
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    		//if(!found) {
    			//System.out.println("record not found");
    		//}
    		System.out.println("--------------------------");
    	}
    
    
    public void getEmployeeByName() {
		ArrayList<EmployeeRecord> list=createListofemployee();
		//Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter name to search");
		System.out.println("--------------------------");
		 Iterator<EmployeeRecord> i = list.iterator();
		 String name = sc1.nextLine();
		
			System.out.println(i.next());
		
			
		System.out.println("--------------------------");
	}

    public void getEmployeeBySalary() {
    
    	ArrayList<EmployeeRecord> list=createListofemployee();
		Scanner sc=new Scanner(System.in);
		//Scanner sc1=new Scanner(System.in);
		boolean found=false;
		System.out.println("enter salary to search");
		 int salary = sc.nextInt();
		System.out.println("--------------------------");
		 Iterator<EmployeeRecord> i = list.iterator();
		while(i.hasNext()) {
			EmployeeRecord e=i.next();
			if(e.getSalary()==salary) {
			System.out.println(e);
			found=true;			
	 }
	}
		if(!found) {
			System.out.println("record not found");
		}
		System.out.println("--------------------------");
	}
    
 public void getEmployeeByAddress() {
        
	 ArrayList<EmployeeRecord> list=createListofemployee();
		//Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter address to search");
		System.out.println("--------------------------");
		 Iterator<EmployeeRecord> i = list.iterator();
		 String address = sc1.next();
		 
			System.out.println(i.next());
			
		System.out.println("--------------------------");
 }
	public void getmenu() {
		//ArrayList<EmployeeRecord> c=new ArrayList<EmployeeRecord>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int ch;
		
        do{

            System.out.println("1.GetEmployeeById");
            System.out.println("2.GetEmployeeByName");
            System.out.println("3.GetEmployeeBySalary");
            System.out.println("4.GetEmployeeByAddress");
            System.out.println("5.GetUpdate");
            System.out.println("Enter your choice");
            
        ch=sc.nextInt();
        switch(ch) {
        
        case 1:
        	
        	getEmployeeById();
        	break;
        	
        case 2:
        	
        	getEmployeeByName();
        	break;
        case 3:
        	getEmployeeBySalary();
        	break;
        	
        case 4:
        	getEmployeeByAddress();
        	break;
        	
        case 5:
          
        	break;
        	
        	}
        }while(ch!=0);	

}

	public void goodbye()

    {
       System.out.println(" Thank You");
       System.out.println("You Are Logged Out");

    }	
	
	}

	

	


	


	
	


	

