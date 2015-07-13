import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Initially
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d;
		String s,s1;
		String [] t;
					
		Scanner input = new Scanner(new File("initially.dat"));
		PrintWriter output = new PrintWriter(new File("initially.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			t=s.split("\\s+");
			
			out.println(t[0].charAt(0)+". "+t[1]+" "+t[2]);
			output.println(t[0].charAt(0)+". "+t[1]+" "+t[2]);					  
		}		
			
	input.close();
	output.close();	
	}
}