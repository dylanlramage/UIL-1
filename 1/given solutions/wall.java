//Wall Street
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class wall
{ 
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("wall.dat"));
		int N = f.nextInt();
		f.nextLine();
		while(N-->0)
		{
		
		int []g=new int[8];
		String s = f.nextLine();
		Scanner ff = new Scanner(s);
		int x=0;
		//read in initial stock shares and price
		while(ff.hasNext())
		{
			g[x++]=ff.nextInt();
			g[x++]=ff.nextInt();
		}
		//calculate and output initial portfolio value
		int port=0;
		for(x=0;x<g.length;)
		{
			port+=g[x]*g[x+1];
			x+=2;
		}
		out.print(port+" ");
		//read in transaction orders
		s=f.nextLine();
		ff=new Scanner(s);
		x=0;
		while(ff.hasNext())
		{
			int sell = ff.nextInt();
			int price = ff.nextInt();
			if(sell<0&&abs(sell)>g[x])
				g[x]=0;
			else
				g[x]+=sell;
			g[x+1]+=price;
			x+=2;
		}
		port=0;
		for(x=0;x<g.length;)
		{
			out.print(g[x]+" ");
			port+=g[x]*g[x+1];
			x+=2;
		}
		out.println(port);
		}	
	}
}
/*

Test Input File – wall.dat
4
75 20 100 42 50 6 25 154
10 1 30 -3 -40 5 10 -100
50 1 85 2 45 3 15 4
15 1 -100 2 23 -2 -14 10
75 20 100 42 50 6 25 154
100 0 20 0 -35 0 -40 0
50 10 85 20 45 30 15 40
-60 -2 60 5 55 -8 85 10

Test Output To Screen
9850 85 130 10 35 8855
415 65 0 68 1 212
9850 175 120 15 0 8630
4150 0 145 100 100 10825

*/