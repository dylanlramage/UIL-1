//Word Pro 
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class word
{ 
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("word.dat"));
		while(f.hasNext())
		{
			int hand = f.nextInt();
			int type = (int)ceil(hand/3.0*2);
			double cost = 0;
			if(hand>=100)
				cost+=hand*.08;
			else
			if(hand>40)
				cost+=40*.1+(hand-40)*.09;
			else
			cost+=hand*.1;
			
			if(type>50)
				cost+=50*.35+(type-50)*.27;
			else
				cost+=type*.35;
			out.printf("$%.2f\n",cost);
		}
	}
}
/*
Test Input File – word.dat
85
34 
256
25
75
76
900
1

Test Output To Screen
$27.44
$11.45
$70.65
$8.45
$24.65
$25.01
$238.00
$0.45

*/