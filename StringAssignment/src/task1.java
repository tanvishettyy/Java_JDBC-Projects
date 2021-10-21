import java.util.Scanner;

//Frequency of character
public class task1 {
private static Scanner src;

public static void main(String args[])
{
	System.out.println("Enter the word");
	src = new Scanner(System.in);
	String input = src.nextLine();         //saving it in input
	char string[] =input.toCharArray();  //converting string to char array
	int freq[]=new int[string.length]; //creating array to store frequency of letter
	
	

	for (int i=0;i<input.length();i++)
	{
		freq[i]=1;
		for(int j=i+1;j<input.length();j++)
		{
			if(string[i]==string[j])
			{
				freq[i]++;
				string[j]='0';                //make it zero so that is doesnt count again
			}
		}
	}
	System.out.println("Frequency are");
	for(int i=0;i<freq.length;i++)
	{
		if(string[i]!=' ' && string[i]!='0')
		{
			System.out.println(string[i]+"-"+freq[i]);
	}
		
		
	}

}
	
}
