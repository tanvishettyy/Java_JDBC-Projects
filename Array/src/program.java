import java.util.Scanner;

public class program {
	static student stu[ ];
	static Scanner sc= new Scanner(System.in);
	static int nos=0;
public static void main(String args[])
{
	  stu=new student[5];
	  while(true)
	  {
		  
	  System.out.println("1.Enter the Student details");
	  System.out.println("2.Change marks of student");
	  System.out.println("3. Show All details");
	  System.out.println("4. Exit");
	  System.out.println("Enter you choice......");

	  
	  int ch = Integer.parseInt(sc.nextLine());
	  switch(ch)
	  {
		  case 1:
			  stuDetail();
			  break;
		  case 2:
			  changeMark();
			  break;
		  case 3:
			  showAll();
			  break;
		  case 4:
			  System.exit(0);
			  break;
	  }
	  }
	 
}

public static void stuDetail()
{
	 System.out.println("Enter Name:");
	 String name=sc.nextLine();
	 System.out.println("Enter roll no");
	 int roll = Integer.parseInt(sc.nextLine());
	 System.out.println("Enter marks");
	 int marks = Integer.parseInt(sc.nextLine());
	 nos++;
	 stu[nos]=new student(roll,name,marks);
	 	 
}
public static void changeMark()
{
	System.out.println("Enter roll no:");
	int roll = Integer.parseInt(sc.nextLine());
	System.out.println("Enter new marks:");
	int marks = Integer.parseInt(sc.nextLine());
	for(int i=0;i<5;i++)
	{
		student temp=stu[i];
		if(roll==temp.getRoll())
		{
			temp.setMarks(marks);
		}
	}
	
}
public static void showAll()
{
	for(int i=0;i<nos;i++)
	{
		student temp=stu[i];
		temp.toString();
		
	}
}

}

