import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class DNA2
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d;
		String s,s1,bit1,bit2;
		String [] t;
		char ch=' ';
		StringBuffer sb = new StringBuffer();
		boolean done=false;
					
		Scanner input = new Scanner(new File("dna2.dat"));
		PrintWriter output = new PrintWriter(new File("dna2.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
		bit2="";bit1="";		
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			s1=input.nextLine().trim();
			s1="";
			for(b=0;b<s.length();b++)
			{
				if(s.charAt(b)=='T')
				 ch='A';
				else if(s.charAt(b)=='A')
				 ch='T';
				else if(s.charAt(b)=='C')
				 ch='G';
				else if(s.charAt(b)=='G')
				 ch='C';
				 
				s1+=ch;  
			}
			
			out.println(s);out.println(s1);
			output.println(s);output.println(s1);
			
			done=false;
						
			for(j=0;j<s.length()-5 && !done;j++)
			{
				for(k=s.length()-1;k>=j+4;k--)
				{
					bit1=s.substring(j,k);
					bit2=s1.substring(j,k);
					sb=new StringBuffer(bit2);
					bit2=sb.reverse().toString();
					
					if(bit1.equals(bit2))
					{
						//out.println(j+" "+bit1);
						done=true;
						break;
					}
				}
			}
			
			if(!done)
			{
				out.println("none");
				output.println("none");
				
			}
			else
			{
				out.println("position "+j+" "+bit1.length()+" long");
				output.println("position "+j+" "+bit1.length()+" long");
			}					  
		}		
			
	input.close();
	output.close();	
	}
}