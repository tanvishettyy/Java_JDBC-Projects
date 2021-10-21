package menu;

import java.util.Scanner;

public class Program {
	
	static Employee emp[];
	static int noe=0;
	static Scanner src=new Scanner(System.in);
	public static void main(String args[])
	{
		 emp = new Employee[100];
		while(true)
		{
		System.out.println("1. Add Employee details.");
		System.out.println("2. Update salary using Empid.");
		System.out.println("3. Show Employee by empid.");
		System.out.println("4. Show All.");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		int ch=Integer.parseInt(src.nextLine());
		switch(ch)
		{
		case 1:
			addEmp();
			break;
		case 2:	
			updSal();
			break;
		case 3:
			showEmp();
			break;
		case 4:
			showAll();
			break;
		case 5:
			System.exit(0);
		
	}
	}
}

public static void addEmp()
{
	System.out.println("Enter Employee Id:");
	int empid=Integer.parseInt(src.nextLine());
	System.out.println("Enter Employee Name:");
	String name=src.nextLine();
	System.out.println("Enter Employee Salary:");
	float salary=Float.parseFloat(src.nextLine());
	emp[noe]= new Employee(empid,name,salary);
	noe++;
	
}
public static void updSal()
{
	System.out.println("Enter Employee Id:");
	int empid=Integer.parseInt(src.nextLine());
	System.out.println("Enter Salary:");
	float salary=Float.parseFloat(src.nextLine());
	for(int i=0;i<noe;i++)
	{
		Employee temp=emp[i];
		if(empid==temp.getEmpid())
		{
			temp.setSalary(salary);
		}
	}
}
public static void showEmp()
{
	System.out.println("Enter Employee Id:");
	int empid=Integer.parseInt(src.nextLine());
	for(int i=0;i<noe;i++)
	{
		Employee temp=emp[i];
		if(empid==temp.getEmpid())
		{
			System.out.println("EmpId:"+temp.getEmpid()+" "+"EmpName:"+temp.getName()+" "+" "+"EmpSalary:"+temp.getSalary());
		}
		else{
			System.out.println("Enter valid EmpId");
		}
	}
	
}

public static void showAll()
{
	for(int i=0;i<noe;i++)
	{
	    Employee temp=emp[i];
		System.out.println("EmpId:"+temp.getEmpid()+" "+"EmpName:"+temp.getName()+" "+" "+"EmpSalary:"+temp.getSalary());
	}
}
}

