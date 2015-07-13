import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class ReallyRandom
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d,total=0;
		int[] rolls = new int[7];	
		String s,s1;
		boolean tf;
		//String[] t;
	
		Scanner input = new Scanner(new File("reallyrandom.dat"));
		PrintWriter output = new PrintWriter(new File("reallyrandom.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
		
		for(i=0;i<a;i++)
		{			
			s=input.nextLine();	
			tf=true;
			
			for(b=0;b<s.length();b++)
			{
				c=s.charAt(b)-'0';
				rolls[c]++;
			}
			//for(int z:rolls)
			  //out.print(z+" ");
			
			for(d=1;d<rolls.length;d++)
			{
				if(rolls[d]>12 || rolls[d]<8)
				 tf=false;
			} 
			 
			if(tf)
			{
				out.println("YES");
				output.println("YES");
			}
			else
			{
				out.println("NO");
				output.println("NO");
			} 
			 
		
			rolls=new int[7];		
			  
		}		
			
	input.close();
	output.close();	
	}
}