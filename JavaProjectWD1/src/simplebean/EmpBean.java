package simplebean;

public class EmpBean {
	
/*
 Java Beans is concept where we store values inside the 
 variables indirectly with the help of setter and getter
 method 
 	
SETTER METHOD:- is used to store values inside the variable
GETTER METHOD :- is used to get or print values from the variable 


SETTER METHOD:- METHOD WITH PARAMETERS 
GETTER METHOD:- METHOD WITHOUT VOID 

 Java beans make the code more secured 
 this keyword is used to share value of parameter with private variable
 */


private	int empid; //101
private	String empname;
private	double empsal;
	
//SETTER METHOD          101
public void setEmpid(int id)
{
	this.empid=id; //101
}

//GETTER METHOD
public int getEmpid()
{
	return empid;
}

//setter method
public void setEmpname(String name)
{
	this.empname=name;
}

//getter method 
public String getEmpname()
{
	return empname;
}

//setter method 
public void setEmpsal(double sal)
{
	this.empsal=sal;
}

//getter method 
public double getEmpsal()
{
	return empsal;
}






	
	
	
	
	
	

}
