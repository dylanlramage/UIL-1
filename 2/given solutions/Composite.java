import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Composite
{
	public static void main(String[] args) throws IOException
	{
		int i,a,b,c,d;
		String s,s1;
		ArrayList<String> list = new ArrayList<>();
		//ArrayList<Integer> comps = new ArrayList<>();
			
		Scanner input = new Scanner(new File("composite.dat"));
		PrintWriter output = new PrintWriter(new File("composite.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			b=Integer.parseInt(s);
			list.clear();
			//out.println(b);
			for(c=4;c<(Math.sqrt(b));c++)
			{
				//out.println(c+" "+isPrime(c));
				if(b%c==0 && !isPrime(c) && !isPrime(b/c))
				 list.add(c+" and "+(b/c));
			}
			
			//out.println(list);
			s1=list.toString();
			if(list.size()==0)
			{
				out.println("none");
				output.println("none");
			}			
			else
			{
				out.println(s1.substring(1,s1.length()-1));
				output.println(s1.substring(1,s1.length()-1));
			}
			/*if(total>=20.0)
			{
				out.println("YES");
				output.println("YES");
			}
			else
			{
				out.println("NO");
				output.println("NO");
			} */
					  
		}		
			
	input.close();
	output.close();	
	}
	
	public static boolean isComposite(int n)
	{
		int a,b;
		b=0;
		for(a=4;a<n;a++)
		{
			
			if(n%a==0)
			 b++;
		}
		//out.println("  "+b);
		
		if(b==0)
		 return false;
		else
		 return true; 
		
	}
	
	public static boolean isPrime(int n)
	{
	 	int a,b;
		b=0;
		for(a=2;a<n; a++)
		{
			if(n%a==0)
			{
				return false;
			}
			
		}
		return true;
	}
}