package com.jdbc.dao;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import com.jdbc.model.Emp;


public class EmpDAO 
{
	public static boolean addEmployee(Emp obj)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
	
			// check if empno exixts or not
			boolean falg=EmpDAO.ifEmpnoExists(obj.getEmpno());
			if(falg==false)
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
				String sql="insert into emp(empno,ename,job,sal,deptno) values(?,?,?,?,?)";
				PreparedStatement stmt=con.prepareStatement(sql);
				stmt.setInt(1,obj.getEmpno());      //gets empno and sets in database
				stmt.setString(2, obj.getEname());   //1,2,3,4 corresponds to empno ename job.there are the index
				stmt.setString(3,obj.getJob());
				stmt.setFloat(4, obj.getSal());
				stmt.setInt(5,obj.getDeptno());
				int nor=stmt.executeUpdate();     //returns int value. update used for data manipulation
				con.close();
				if(nor>0)
					return true;
				else
			      return false;
			}
			
			else{
				System.out.println("Duplicate Empno");
				return false;
			}
				
			
	
		}
		catch(SQLException e)
		{
			//e.printStackTrace();
			return false;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return false;
	
		}
	}
	
	public static boolean ifEmpnoExists(int empno)
	{
		//List<Emp> arr=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
			String sql="select count(*) as noe from emp where empno=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, empno);
			ResultSet rs=stmt.executeQuery();
			//boolean rf=false;
		//	Emp e;
			int noe=0;
			while(rs.next())
			{
				noe=rs.getInt(1);//int noe=rs.getInt("noe");
				if(noe<0)
				 return false;
				else
					return false;
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}

public static List<Emp> showAllEmployee()
{
	List<Emp> arr=new ArrayList<>();
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
		String sql="select empno,ename,job,sal,deptno from emp ";
		PreparedStatement stmt=con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		//boolean rf=false;
		Emp e;
		while(rs.next())
		{
			e=new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
			arr.add(e);
		}
		con.close();
		return arr;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return null;
	}

}

public static boolean updateSalByEmpno(Emp obj )
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
		String sql="update emp set sal=? where empno=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setFloat(1, obj.getSal());
		stmt.setInt(2, obj.getEmpno());
		int nor=stmt.executeUpdate();
		if(nor>0)
		  return true;
		return false;
		//ResultSet rs=stmt.executeQuery();
		
		//con.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
	//return false;
}

public static boolean delEmployee(Emp obj)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
		String sql="delete from emp where empno=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1, obj.getEmpno());
		int nor=stmt.executeUpdate();
		if(nor>0)
		  return true;
		return false;
		
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return false;
	}
	
}

public static List<Emp> showbyEmpno(Emp obj)
{
	List<Emp> arr1 =new ArrayList<>();
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
		String sql = "select empno,ename,job,sal,deptno from emp where empno=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,obj.getEmpno());
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			Emp e1= new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
			arr1.add(e1);
		}
		
		con.close();
		return arr1;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return null;
	}
	
}

}
