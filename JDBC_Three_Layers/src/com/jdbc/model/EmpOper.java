package com.jdbc.model;

//import java.util.ArrayList;
import java.util.List;

import com.jdbc.dao.EmpDAO;

public class EmpOper 
{
	
public static boolean addEmployee(Emp obj)
	{
		if(obj.getSal()>10000 && obj.getSal()<500000)
		{
			
		}
		if(obj.getDeptno()==10 || obj.getDeptno()==20 ||obj.getDeptno()==30 ||obj.getDeptno()==40)
		{
			
		}
		if(EmpDAO.addEmployee(obj))
		return true;
		 return false;
	}
public static List<Emp> showAllEmployee()
{
	List<Emp> arr=EmpDAO.showAllEmployee();
	return arr;
}

public static boolean updateSalByEmpno(Emp obj)
{
	if(EmpDAO.updateSalByEmpno(obj))
		return true;
	else
		return false;
	
}
public static boolean delEmployee(Emp obj)
{
	if(EmpDAO.delEmployee(obj))
		return true;
	else 
		return false;
	
}

public static List<Emp> showbyEmpno(Emp obj)
{
	List<Emp> arr=EmpDAO.showbyEmpno(obj);
	return arr;
}
}
