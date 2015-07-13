import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class ConVow
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d;
		String s,s1="aeiou";
				
		Scanner input = new Scanner(new File("convow.dat"));
		PrintWriter output = new PrintWriter(new File("convow.out"));		
						
		while(input.hasNextLine())
		{			
			s=input.nextLine().trim();
			j=0;
			
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					out.print(" ");
					output.print(" ");
				}
				else if(s1.indexOf(s.charAt(i))>-1)
				{
					out.print(s.charAt(i));
					output.print(s.charAt(i));
				}				
				else
				{
				
					//out.println("vowel"+s.charAt(i));
					out.print(s1.charAt(j%5));
					output.print(s1.charAt(j%5));
					
					j++;
					
				}
			
				
			}
			out.println();
			output.println();
					
							  
		}		
			
	input.close();
	output.close();	
	}
}