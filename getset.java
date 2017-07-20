//this is program for getter and setter method 

import java.util.*;
class employee{
	private int eid;
	private String ename;
	private double salary;
	
	public int getid(){
		return eid;
	}
	public String getname(){
		return ename;
	}
	public double getsalary(){
		return salary;
	}
	
	
	public void  setid(int id){
		eid=id;
	}
	public void setname(String name){
		ename=name;
	}
	public void setsalary(int sal){
		salary=sal;
	}
	
	//using same classs(getter and setter are useless in this case) while you can use another class 

	public static void main (String[] args) {
    employee emp=new employee();
    emp.setid(10);
    emp.setname("akshay");
    emp.setsalary(33000);
    System.out.println("id"+emp.getid()+"\nname"+emp.getname()+"\nsalary"+emp.getsalary());
  }
}

