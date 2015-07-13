//Condensation 
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class condensation
{ 
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("condensation.dat"));
		while(f.hasNext())
		{
			String s = f.nextLine();
			switch(s)
			{
				case "zero":s="0";break;
				case "one":s="1";break;
				case "two":s="2";break;
				case "three":s="3";break;
				case "four":s="4";break;
				case "five":s="5";break;
				case "six":s="6";break;
				case "seven":s="7";break;
				case "eight":s="8";break;
				case "nine":s="9";break;
			}
			if(s.length()<4)
			{
				out.println(s);
				continue;//jumps to the next interation of the loop, skips all below
			}
			StringBuilder sb = new StringBuilder(s);
			for(int x=0;x<sb.length()-1;x++)
				if(sb.charAt(x)==sb.charAt(x+1))
					sb.deleteCharAt(x);
			for(int x=1;x<sb.length()-1;x++)
				if("aeiou".indexOf(sb.charAt(x))>-1)
					sb.deleteCharAt(x);

			out.println(sb);
		}
	}
}

/*
Test Input File – condensation.dat
bookkeeper
beehives
three
eat
elephants
mississippi
one
zebra
parallel

Test Output To Screen
bkpr
bhvs
3
eat
elphnts
msspi
1
zbra
prll
*/