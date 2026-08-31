package simplebean;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		//POM - PAGE OBJECT MODEL 
		
		EmpBean emp=new EmpBean();
		
		System.out.println("Enter EMP ID:-");
		emp.setEmpid(sc.nextInt());
		
		System.out.println("Enter EMP NAME:-");
		emp.setEmpname(sc.next());
		
		System.out.println("Enter EMP SALARY:-");
		emp.setEmpsal(sc.nextDouble());
		
		
		System.out.println("EMP ID:- "+emp.getEmpid());
		System.out.println("EMP NAME:- "+emp.getEmpname());
		System.out.println("EMP SALARY:- "+emp.getEmpsal());
		
		/*
		 Package Name:- devicedetails
		 DeviceBean 
		 deviceID
		 deviceName
		 deviceOS
		 kernalVersion
		 Manf_Date 
		 IMEI_Code
		 RAM_Details
		 DeviceType
		 password
		 confirm password 
		 
		 
		 
		 
		 */
		
	}

}
