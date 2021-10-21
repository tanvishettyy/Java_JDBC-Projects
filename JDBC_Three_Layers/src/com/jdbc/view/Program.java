package com.jdbc.view;
import java.util.List;
import java.util.Scanner;
import com.jdbc.controller.EmpController;
import com.jdbc.model.Emp;

public class Program {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("1. Add Employee");
			System.out.println("2. Show All employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Show by Employee No.");
			System.out.println("6. Exit");
			int ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
			case 1: 
				System.out.println("Enter EmpNo:");
				int eno=Integer.parseInt(sc.nextLine());
				System.out.println("Enter EmpName:");
				String ename =sc.nextLine();
				System.out.println("Enter job:");
				String job =sc.nextLine();
				System.out.println("Enter Salary:");
				float sal=Float.parseFloat(sc.nextLine());
				System.out.println("Enter DeptNo:");
				int dno=Integer.parseInt(sc.nextLine());
				
				if(EmpController.addEmployee(eno,ename,job,sal,dno))
				 System.out.println("Succedd Added");
	
				else
					System.out.println("Not added");
					 break;

			case 2: 
				List<Emp> arr=EmpController.showAllEmployee();
			for(Emp obj:arr)
			{
				System.out.println(obj.toString());
			}
				break;
			case 3:
				System.out.println("Enter EmpNo:");
				int no=Integer.parseInt(sc.nextLine());
				System.out.println("Enter Salary:");
				float newsal=Float.parseFloat(sc.nextLine());
				if(EmpController.updateBySalEmpno(no, newsal))
					System.out.println("Update Succ");
				else 
					System.out.println("Some issue. Not Done");
				break;
				
			case 4:
			{
				System.out.println("Enter EmpNo:");
				int en=Integer.parseInt(sc.nextLine());
				if(EmpController.delEmployee(en))
					System.out.println("Deleted Succ");
				else
					System.out.println("Not done");
				break;
				
			}
			case 5:
			{
				System.out.println("Enter Empno:");
				int en1=Integer.parseInt(sc.nextLine());
				List<Emp> arr1 = EmpController.showbyEmpno(en1);
				System.out.println(arr1.toString());
				break;
			}
			default:
			System.exit(0);
			}
		}
	}
}
