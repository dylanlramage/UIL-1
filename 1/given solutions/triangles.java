//Triangles 
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class triangles
{ 
	static double dist(double p1, double p2, double p3, double p4)
	{
		return sqrt(pow(p4-p2,2)+pow(p3-p1,2));
	}
	static double heron(double a, double b, double c)
	{
		double s = (a+b+c)/2.0;
		return sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("triangles.dat"));
		while(f.hasNext())
		{
			String s = f.nextLine();
			//array to hold triangle data...3 ordered pairs of points,3 side lengths
			double[]tri=new double[9];
			double perim,area;
			Scanner ff = new Scanner(s);
			int x=0;
			while(ff.hasNext())
				tri[x++]=ff.nextInt();
			tri[6]=dist(tri[0],tri[1],tri[2],tri[3]);
			tri[7]=dist(tri[2],tri[3],tri[4],tri[5]);
			tri[8]=dist(tri[4],tri[5],tri[0],tri[1]);
			perim=tri[6]+tri[7]+tri[8];
			area=heron(tri[6],tri[7],tri[8]);
			out.printf("%.0f %.0f\n",area,perim);
		}
	}
}
/*
Test Input File – triangles.dat
20 20 35 20 20 30
-12 3 9 31 20 -17
0 0 3 0 3 4
0 0 5 5 -5 5
0 0 5 0 0 10
-5 2 9 -7 19 20
23 43 12 98 43 65
12 4 4 56 7 89

Test Output To Screen
75 43
658 122
6 12
25 24
25 26
234 75
671 131
210 171

*/