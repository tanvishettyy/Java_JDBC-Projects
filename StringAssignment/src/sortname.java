//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortname {
	static Scanner sc =new Scanner(System.in); 
public static void main(String args[])
{
	//int i=0;
	String arr[]={"abc", "bfgh", "gfvd", "acvf"};
	//System.out.println("Enter number of person");
//	int n=Integer.parseInt(sc.nextLine());
//	for(i=0;i<n;i++)
//	{
//		String arr[i]=new String();
//		String arr[i]=sc.nextLine();
//		
//	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	
}
}
