import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Percent
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d;
		double x,total,y,z;
		String s,s1;
		total=0.0;
			
		Scanner input = new Scanner(new File("percent.dat"));
		PrintWriter output = new PrintWriter(new File("percent.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			x=Double.parseDouble(s);
			y=x*100.;
			out.printf("%.1f%% %n",y);
			output.printf("%.1f%% %n",y);	
					  
		}		
			
	input.close();
	output.close();	
	}
}