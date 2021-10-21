///*Assignment No:1 on ArrayList:
//Menu Driven Application with follwing Choices using ArrayList:
//1. Add New Employee (empno,ename,sal,dept taken form user)
//2. Update salary by empno ( empno and new salary taken from user)
//3. Display employee details by empno (empno taken from user)
//4. Show all employee details for a given dept in tabular form( dept taken from user)
//5. Display all Employees details
//6. Remove employee details by empno
//0: Exit*/

import java.util.ArrayList;
import java.util.Scanner;

public class menuDriven {
	static emp e;
	static ArrayList<emp> arr;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		arr = new ArrayList ();
		//arr.add(e);
		
		
		while(true){
			
		
		System.out.println("1. Add employee deatils");
		System.out.println("2. Update Salary");
		System.out.println("3. Display Employee details by Empno");
		System.out.println("4. Show all employee details for a given dept in tabular form");
		System.out.println("5. Display all Employees details");
		System.out.println("6. Remove employee details by empno");
		System.out.println("0. Exit");
		System.out.println("Enter the choice..............");
		int ch=Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1:
			addEmp();
		  break;
		case 2:
			updSal();
			break;
		case 3:
			empDet();
			break;
		case 4:
			showbydept();
			break;
		case 5:
			showall();
			break;
		case 6:
			remdet();
			break;
		case 0:
			System.exit(0);
			break;
			
		}
		}
	}
	
public static void addEmp()
{
	System.out.println("Enter empno");
	int empno=Integer.parseInt(sc.nextLine());
	System.out.println("Enter name");
	String name=sc.nextLine();
	System.out.println("Enter Salary");
	int sal=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Dept");
	String dept=sc.nextLine();
	e=new emp(empno,name,sal,dept);
	arr.add(e);
	 System.out.println("Added");
}
public static void updSal()
{
	System.out.println("Enter empno");
	int empno=Integer.parseInt(sc.nextLine());
	System.out.println("Enter new Salary");
	int sal=Integer.parseInt(sc.nextLine());
	for(Object obj: arr)
	{
		emp temp=(emp)obj; // type casting
		if(empno==temp.getEmpno())
		{
			temp.setSal(sal);
		}
	}

}
public static void showall()
{
	System.out.println("EmpNO:\tEmpName\tSalary\tDept\n");
	for(Object obj: arr)
	{
	 emp temp=(emp)obj;
     System.out.println(temp.getEmpno()+"\t"+temp.getEname()+"\t"+temp.getSal()+"\t"+temp.getDept());  
    }  
}

 public static void empDet()
 {
	System.out.println("Enter empno");
	int empno=Integer.parseInt(sc.nextLine()); 
	for(Object obj: arr)
	{
	   emp temp=(emp)obj;
      if(temp.getEmpno()==empno)
      {
    	  System.out.println("EmpNO:\tEmpName\tSalary\tDept\n"+temp.getEmpno()+"\t"+temp.getEname()+"\t"+temp.getSal()+"\t"+temp.getDept());  
      }
    }
 }
 
 
 public static void showbydept()
 {
	 System.out.println("Enter Dept");
	 String dept=sc.nextLine();
	 for(Object obj: arr)
		{
		 emp temp=(emp)obj;
	   
	      if(temp.getDept().equals(dept))
	      {
	    	  System.out.println("EmpNO:\tEmpName\tSalary\tDept\n"+temp.getEmpno()+"\t"+temp.getEname()+"\t"+temp.getSal()+"\t"+temp.getDept());  
	      }
	      
	    	  
         }
 }
public static void remdet()
{
	System.out.println("Enter empno");
	int empno=Integer.parseInt(sc.nextLine()); 
	for(Object obj: arr)
	{
	 emp temp=(emp)obj;
      if(temp.getEmpno()==empno)
      {
    	  arr.remove(temp);
    	  break;
    	 // arr.remove(i)
      }
	}
	
  
 }
}
