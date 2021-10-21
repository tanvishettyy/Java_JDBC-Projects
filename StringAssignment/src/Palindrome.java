//Plalindrome

import java.util.Scanner;

public class Palindrome {
	static Scanner sc =new Scanner(System.in);
public static void main(String args[])
{
	while(true)
	{
	System.out.println("Enter the Sring");
	String input=sc.nextLine();
	char arr[]=input.toCharArray();
	int n=input.length();
	String rev=new String();
		
	for(int i=n-1;i>=0;i--)
	{
		
			rev+=arr[i];
			
	
	}
	System.out.println(rev);
if(rev.equals(input))
{
	System.out.println("Palindrome");
	
}
else
{
	System.out.println("Not palindrome");
}
}
}
}
