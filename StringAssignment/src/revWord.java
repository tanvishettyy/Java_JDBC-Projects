import java.util.Scanner;

public class revWord {
	static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
	int j=0;
	int i=0;
		System.out.println("Enter the String");
		String input=sc.nextLine();
		String output=new String();
		System.out.println(input.length());
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				 j++;
				 
			}
			else if(input.charAt(i)==' ')
			{
				for(int k=j-1;k>=0;k--)
				{
					output+=input.charAt(k);
				}
				j=0;
				output+=' ';
			}
			
		}
		System.out.println(output);
		
}
}
