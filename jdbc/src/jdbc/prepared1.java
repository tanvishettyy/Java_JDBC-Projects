package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prepared1 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","tanvi");
		PreparedStatement smt=con.prepareStatement(" insert into emp values(? ? ?)");
				
		System.out.println("Enter empno");
		int eno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter empname");
		String nm=sc.nextLine();
		System.out.println("Enter salary");
		int s1=Integer.parseInt(sc.nextLine());
		
	    smt.setInt(1,eno);
	    smt.setString(2,nm);
	    smt.setInt(3,s1);
	    int nor=smt.executeUpdate();
	    System.out.println(nor+"Record Added Succ");
	    
		
}
		catch(SQLException c)
		{
			c.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}