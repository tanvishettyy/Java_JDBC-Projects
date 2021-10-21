import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.IOException;

/*Assignment on File Handling: 
 * There are three files (a.txt, b.txt, c.txt) .
 *  C.txt is empty. 
 *  Read one line from a.txt and next line from b.txt and put in c.txt in in alternate position of lines. 
 *  Put some data in multiple lines in a.txt and b.txt file which will be copied in c.txt file through program in alternate line no's.
 */

public class files {
public static void main(String[] args) throws FileNotFoundException,Exception {
	try{
		
	int i,j;
	int k=(int)('\n');
	
	FileReader fa=new FileReader("a.txt");
	FileReader fb=new FileReader("b.txt");
	FileWriter fc=new FileWriter("c.txt");
	String str="";
	String str1="";
	while((fa.read()!=-1 ) && (fb.read()!=-1) )
			{
		

	while((i=fa.read())!=k)
	{
		str += (char)i;
	}

	System.out.println(str);
	fc.write(str);
	str="";
	
	while((j=fb.read())!=k)
    {
		str1 += (char)j;
	}
	
	System.out.println(str1);
	fc.write(str1);
	str1="";
		}
	
	fa.close();
    fb.close();
	fc.close();
	}
	
    catch (IOException e)
	{
    	  
        System.out.println("There are some IOException");
        System.out.println(e.getMessage());
    }
	
}
}
