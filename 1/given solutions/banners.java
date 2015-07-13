//Banners 
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class banners
{ 
	static char [] ban;
	static ArrayList<Integer> starts;
	public static void outputBanners()
	{
		int x=0;
		for(char a:ban)
			if(x++>0)
				out.print(a);
		out.println();
	}
	public static void removeBanner(int n)
	{
		int st = starts.remove(n-1);
		out.println("REMOVE BANNER AT POSITION "+st);
		int x=st;
		ban[x]='-';x++;
		while(ban[x]!='\\')
			ban[x++]='-';
		
	}
	public static void addBanner(int n)
	{
		int gap = n;
		int x=1;
		while(gap>0)
		{
			if(ban[x++]=='-')
				gap--;
			else
				gap=n;
		}
		int start = x-n;
		out.println("ADD BANNER AT POSITION "+start);
		Arrays.fill(ban,start,x,'*');
		ban[start]='\\';
		starts.add(start);
		Collections.sort(starts);
	}
		
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner f = new Scanner(new File("banners.dat"));
		//initialize empty banner wall
		ban = new char[78];
		
		Arrays.fill(ban,'-');
		//read in banners
		String s = f.nextLine();
		Scanner ff = new Scanner(s);
		starts = new ArrayList<Integer>();
		while(ff.hasNext())
		{
			int start = ff.nextInt();
			starts.add(start);
			int wide = ff.nextInt();
			ban[start]='\\';
			Arrays.fill(ban,start+1,start+wide,'*');
		}
		
		int n = f.nextInt();
		while(n-->0)
		{
			String ra = f.next();
			int num = f.nextInt();
			int st = 0;
			if(ra.equals("REMOVE"))
				removeBanner(num);
			else
				addBanner(num);
		}
	}
}
/*
Test Input File – banners.dat
5 2 16 11 35 3 38 4 42 8 51 6
10
REMOVE 4
ADD 8
REMOVE 4
ADD 9
ADD 3
REMOVE 4
REMOVE 2
ADD 13
REMOVE 3
ADD 6

Test Output To Screen
REMOVE BANNER AT POSITION 38
ADD BANNER AT POSITION 7
REMOVE BANNER AT POSITION 35
ADD BANNER AT POSITION 27
ADD BANNER AT POSITION 1
REMOVE BANNER AT POSITION 16
REMOVE BANNER AT POSITION 5
ADD BANNER AT POSITION 57
REMOVE BANNER AT POSITION 27
ADD BANNER AT POSITION 15

*/