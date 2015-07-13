import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Nu
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d,total=0;
		double x,y,z;
		String s,s1;
			
		Scanner input = new Scanner(new File("nu.dat"));
		PrintWriter output = new PrintWriter(new File("nu.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
		
		for(i=0;i<a;i++)
		{			
			s=input.nextLine();	
			x=Double.parseDouble(s);
			y=3.0e8/x;
		
		
			out.printf("%.2E %n",y);
			output.printf("%.2E %n",y);				
			  
		}		
			
	input.close();
	output.close();	
	}
}