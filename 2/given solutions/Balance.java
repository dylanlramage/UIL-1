import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Balance
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d;
		String s;
		ArrayList<String> bankc = new ArrayList<>();
		ArrayList<String> userc= new ArrayList<>();		
		ArrayList<String> bankd = new ArrayList<>();
		ArrayList<String> userd = new ArrayList<>();		
				
		Scanner input = new Scanner(new File("balance.dat"));
		PrintWriter output = new PrintWriter(new File("balance.out"));		
						
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(i=0;i<a;i++)
		{	
			bankc.clear(); userc.clear(); bankd.clear(); userd.clear();		
			s=input.nextLine().trim();
			b=Integer.parseInt(s);			
			//s=input.nextLine().trim();
			for(j=0;j<b;j++)
			{
				s=input.nextLine().trim();
				if(s.charAt(0)=='(')
				 bankd.add(s);
				
				else
				 bankc.add(s);
			}
			s=input.nextLine().trim();
			b=Integer.parseInt(s);			
			//s=input.nextLine().trim();
			for(j=0;j<b;j++)
			{
				s=input.nextLine().trim();
				if(s.charAt(0)=='(')
				 userd.add(s);
				
				else
				 userc.add(s);
			}
			
			
			if(userc.size()==bankc.size() && userd.size()==bankd.size())
			{
				out.println("correct");
				output.println("correct");
			}
			else
			{
				//out.println(userc +" "+userd);
				if(bankc.size()-userc.size()==1 && bankd.size()==userd.size())
				{
					bankc.removeAll(userc);
					s=bankc.get(0);					
					out.println("one entry missed: a credit of "+s);
					output.println("one entry missed: credit of "+s);									
					
				}
				else if(bankd.size()-userd.size()==1 && bankc.size()==userc.size() )
				{
					bankd.removeAll(userd);
					s=bankd.get(0);
					s=s.substring(1,s.length()-1);
					out.println("one entry missed: a debit of "+s);
					output.println("one entry missed: debit of "+s);					
				}
				else if(bankc.size()-userc.size()==1 && bankd.size()<userd.size())
				{
					bankc.removeAll(userc);
					s=bankc.get(0);
					out.println("debit of "+s+" should be credit");
					output.println("debit of "+s+" should be credit");
				}
				else
				{
					bankd.removeAll(userd);
					s=bankd.get(0);
					s=s.substring(1,s.length()-1);
					out.println("credit of "+s+" should be debit");
					output.println("credit of "+s+" should be debit");
				}
				
				
			}			
				
		}				
			
	input.close();
	output.close();	
	}
}