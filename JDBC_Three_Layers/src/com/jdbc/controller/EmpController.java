package com.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Emp;
import com.jdbc.model.EmpOper;

public class EmpController
{
	public static boolean addEmployee(int eno,String ename, String job, float sal, int dno)
	{
		Emp e=new Emp(eno,ename,job,sal,dno);
		if(EmpOper.addEmployee(e))
		   return true;
		return false;
	}

public static List<Emp>  showAllEmployee()
	{
		List<Emp> arr=new ArrayList<>();
		arr=EmpOper.showAllEmployee();
		return arr;
		}
		
	
	
public static boolean updateBySalEmpno(int empno,float newsal)
{
	Emp e=new Emp();
	e.setEmpno(empno);
	e.setSal(newsal);
	if(EmpOper.updateSalByEmpno(e))
		return true;
	else 
		return false;
	
}
public static boolean delEmployee(int empno)
{
	Emp e =new Emp();
	e.setEmpno(empno);
	if(EmpOper.delEmployee(e))
	
		return true;
	else 
		return false;
	
}
public static List<Emp> showbyEmpno(int empno)
{
	Emp e= new Emp();
	e.setEmpno(empno);
	List<Emp> arr = new ArrayList<>();
	arr= EmpOper.showbyEmpno(e);
	return arr;
}
}
