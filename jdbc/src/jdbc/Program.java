package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Program {

	public static void main(String[] args) {

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_info","root","tanvi");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from details");
while(rs.next())
System.out.println(rs.getString(1)+" "+rs.getString(2));//+" "+rs.getString(3)+" "+rs.getInt(4));
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}

	}

}
