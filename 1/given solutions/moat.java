//Moat Point 
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class moat
{ 
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("moat.dat"));
		int N = f.nextInt();
		
		while(N-->0)
		{
			int moat=0;
			String s = f.next();
			for(int x=0;x<s.length();x+=2)
			{
				switch(s.charAt(x))
				{
					case 'A':moat+=15;break;
					case 'K':
					case 'Q':
					case 'J':moat+=12;break;
					case '0':moat+=10;break;
					default:moat+=s.charAt(x)-48;
				}
			}
			out.println(moat);
		}
	}
}

/*
Test Input File – moat.dat
11
0C9CADQD6D5DAHKS0S7S
4SQD6D4D0C9CJS6C6H2D
JD5H5C3S3H3C8SAS2H0H
2SQC0C0S7SAH5SACKHQH
9D6S7HJCQSJH4H8H5DKC
4CKS9SKD3D8C2C8HAD7C
3D6H7C5C9HKD2D6S5D2S
0S9CAC3HAS4DAH2CADKC
6DKS9SJS0D0CJD7H8D8S
6C5S3DQS4S7D3C8C3SQC
2HKH5HQH0HQDJH8H8S9D

Test Output To Screen
101
71
66
100
87
80
57
100
94
63
90
*/