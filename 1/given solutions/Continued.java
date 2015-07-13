//Continued  
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Continued
{ 
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("continued.dat"));
		while(f.hasNext())
		{
			int num=f.nextInt();
			int den=f.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			do
			{
				list.add(num/den);
				num=num%den;
				
				//flip fraction
				int temp=num;
				num=den;
				den=temp;
			}
			while(num!=1);
			for(int e:list)
				out.print(e+" ");
			out.println();
		}
	}
}
/*
Test Input File – continue.dat
27 8
1 2
3 2
7 4
30 13
11 8
41 9
21 13

Test Output To Screen
3 2 1 2
0 2
1 2
1 1 3
2 3 4
1 2 1 2
4 1 1 4
1 1 1 1 1 2
*/