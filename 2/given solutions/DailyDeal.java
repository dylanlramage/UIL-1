import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class DailyDeal
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d;
		double x,total,y,z;
		String s,s1;
		total=0.0;
			
		Scanner input = new Scanner(new File("dailydeal.dat"));
		PrintWriter output = new PrintWriter(new File("dailydeal.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
		
		
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			b=Integer.parseInt(s);
			total=0.0;
			
			for(c=0;c<b;c++)
			{
				s=input.nextLine().trim();
				x=Double.parseDouble(s);
				total+=x;
			}
			
			if(total>=20.0)
			{
				out.println("YES");
				output.println("YES");
			}
			else
			{
				out.println("NO");
				output.println("NO");
			} 
					  
		}		
			
	input.close();
	output.close();	
	}
}