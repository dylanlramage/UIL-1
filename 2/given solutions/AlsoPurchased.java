import java.util.*; // for Scanner from Java 1.5, 1.6
import java.io.*;   // for file input
import static java.lang.System.*;

public class AlsoPurchased
{
	public static void main(String[] args) throws IOException
	{
		int i,j,k,a,b,c,d,e;
		String s,s1,s2;
		String[] t;
				
		boolean done=false;
		TreeMap<String,ArrayList<String>> genre = new TreeMap<>();
		TreeMap<String,ArrayList<String>> author = new TreeMap<>();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		ArrayList<String> temp2 = new ArrayList<>();
		ArrayList<String> purchased = new ArrayList<>();
									
		Scanner input = new Scanner(new File("alsopurchased.dat"));
		PrintWriter output = new PrintWriter(new File("alsopurchased.out"));		
							
		for(i=0;i<100;i++)
		{			
			s=input.nextLine().trim();
			t=s.split("[*]");
			if(genre.get(t[2])==null)
			{
				list=new ArrayList<String>();
				list.add(t[0]);
				genre.put(t[2],list);
			}
			else
			{
				list=genre.get(t[2]);
				list.add(t[0]);
				genre.put(t[2],list);
			}
						
			if(author.get(t[1])==null)
			{
				list=new ArrayList<String>();
				list.add(t[0]);
				author.put(t[1],list);
				
			}
			else
			{
				list=author.get(t[1]);
				list.add(t[0]);
				author.put(t[1],list);
			}			
							  
		}
		
	//	out.println(genre+"\n\n");
	//	out.println(author);
		s=input.nextLine().trim();
		a=Integer.parseInt(s);
		
		for(b=0;b<a;b++)
		{
			s=input.nextLine().trim();
			temp=new ArrayList<String>();
			temp2=new ArrayList<String>();
			purchased=new ArrayList<String>();
			
			out.println(s);
			output.println(s);
			out.println("Customers also purchased:");
			output.println("Customers also purchased:");
			
			for(String ss:author.keySet())
			{
				list=author.get(ss);
				if(list.contains(s))
				{
					temp=author.get(ss);
					break;
				}
			}			
			
			temp.remove(s);
			Collections.sort(temp);
			//out.println("   --"+temp);
			
			for(String ss:genre.keySet())
			{
				list=genre.get(ss);
				if(list.contains(s))
				{
					temp2=genre.get(ss);
					break;
				}
			}
			
			temp2.remove(s);
			Collections.sort(temp2);
			//out.println("    --"+temp2);
			c=temp.size();
			if(c>=3)
			{
				for(d=0;d<3;d++)
				{
					purchased.add(temp.get(d));
					//out.println(temp.get(d));
					//output.println(temp.get(d));
				
				}	
			}
			else
			{
				for(d=0;d<temp.size();d++)
				{
					purchased.add(temp.get(d));
					//out.println(temp.get(d));
					//output.println(temp.get(d));
				}
				//out.println(" -- temp2.size()"+temp2.size());
				e=Math.min(3-temp.size(),temp2.size());
				//e=3-temp.size();
				//out.println("C,E == "+c+","+e);
				for(d=0;d<e;d++)
				{
					if(!purchased.contains(temp2.get(d)))
					 purchased.add(temp2.get(d));
					 
					//out.println(temp2.get(d));
					//output.println(temp2.get(d));
				}
				
			}
			for(String ss:purchased)
			{
				out.println(ss);
				output.println(ss);
			}
			
			out.println();
			output.println();
		
		}		
			
	input.close();
	output.close();	
	}
}