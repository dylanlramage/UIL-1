import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class FamilyFeud2
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d;
		String s;
		char[][] mat;
			
				
		Scanner input = new Scanner(new File("familyfeud2.dat"));
		PrintWriter output = new PrintWriter(new File("familyfeud2.out"));		
						
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(d=0;d<a;d++)
		{
			s=input.nextLine().trim();
			b=Integer.parseInt(s);
			mat=new char[b][b];
			
			for(c=0;c<b;c++)
			{
				mat[0][c]='X';
				mat[c][0]='X';
				mat[c][c]='X';
				mat[b-c-1][c]='X';
				mat[b-1][c]='X';
				mat[c][b-1]='X';
				
			}
			
			for(i=0;i<b;i++)
			{
				for(j=0;j<b;j++)
				{
					out.print(mat[i][j]);
					output.print(mat[i][j]);
					
				}
				out.println();
				output.println();
			}
			out.println();
			output.println();		
					
				
		}				
			
	input.close();
	output.close();	
	}
}