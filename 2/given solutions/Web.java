import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class Web
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d;
		String s,s12;
				
		boolean done=false;
		Stack<String> back = new Stack<>();
		Stack<String> forward = new Stack<>();
							
		Scanner input = new Scanner(new File("web.dat"));
		PrintWriter output = new PrintWriter(new File("web.out"));		
			
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
				
		for(i=0;i<a;i++)
		{			
			s=input.nextLine().trim();
			b=Integer.parseInt(s);
			
			forward.clear();
			back.clear();			
			done=false;
						
			for(c=0;c<b && !done;c++)
			{
				s=input.nextLine().trim();
				
				
				if(s.equals("b"))
				{
					if(back.size()==0)
					{
						s="invalid";
					 	done=true;
					 	break;
					}
					else
					{
						
						forward.push(back.pop());
						s=back.peek();
					}
					
				}
				else if(s.equals("f"))
				{
					if(forward.size()==0)
					{
						s="invalid";
						done=true;
						break;
					}
					else
					{
						s=back.push(forward.pop());
					}		
					
				}
				else
				{
					back.push(s);
				}				
				//out.println("    forward="+forward);
				//out.println("    back   ="+back);
			}
			
			out.println(s);
			output.println(s);		
							  
		}		
			
	input.close();
	output.close();	
	}
}