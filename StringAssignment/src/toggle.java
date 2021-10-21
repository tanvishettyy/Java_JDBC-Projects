import java.util.Scanner;

public class toggle {
	static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
	while(true){
		
	System.out.println("Enter the String");
	String input=sc.nextLine();
	String output= new String();
	char arr[]=input.toCharArray();
	for(int i=0;i<input.length();i++)
	{
		
//		if(arr[i]>='A' && arr[i]<='Z')
//		{
//			output+=(char)(arr[i]+'a'-'A');
//		}
//		else if (arr[i]>='a'&&arr[i]<='z')
//		{
//			output+=(char)(arr[i]+'A'-'a');
//		}	
		
		if(Character.isLowerCase(arr[i]))
		{
			arr[i]=Character.toUpperCase(arr[i]);
			output+=arr[i];
			
		}
		else if(Character.isUpperCase(arr[i]))
		{
			arr[i]=Character.toLowerCase(arr[i]);
			output+=arr[i];
			
		}
	}
	System.out.println(output);
}
}
}
