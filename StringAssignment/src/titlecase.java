import java.util.Scanner;
public class titlecase {
	static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
	while(true){
		
	System.out.println("Enter the String:");
	String input=sc.nextLine();
	String output=new String();
	for(int i=0;i<input.length();i++)
	{
		char ch=input.charAt(i);
		if(i==0)
		{
			output+=Character.toUpperCase(ch);
		}
		else if(ch==' ')
		{
			output+=' ';
			output+=Character.toUpperCase(input.charAt(i+1));
			i++;
		}
		else {
			output+=input.charAt(i);
		}
	}
	System.out.println(output);	
}
}
}
