//Squeeze space
import java.util.Scanner;

public class squeeze {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("Enter the String");
		String input=sc.nextLine();
		char arr[]=input.toCharArray();
		int n=input.length();
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]);
			}
		}
	}

}
