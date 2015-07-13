//Stones
//A+ 2014

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class stones
{ 
	static ArrayList<ArrayList<Integer>> set;
	public static int match(ArrayList<ArrayList<Integer>> set,ArrayList<Integer>list) 
	{
		int result = 0;
		if(set.contains(list))
			if(list.equals(set.get(set.size()-1)))
				result = 2;
			else
				result = 1;
		return result;
			
	}
	public static ArrayList<Integer> move(ArrayList<Integer>list)
	{
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(list.size());
		for(Integer i:list)
			if(i>1)
				newList.add(i-1);
		Collections.sort(newList);
		Collections.reverse(newList);
		return newList;
		
	}
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("stones.dat"));
		int N = f.nextInt();
		f.nextLine();
		set = new ArrayList<ArrayList<Integer>>();
		while(N-->0)
		{
			String s = f.nextLine();
			args = s.split(" ");
			int[]list=new int[args.length];
			for(int x=0;x<args.length;x++)
				list[x]=Integer.parseInt(args[x]);
			ArrayList<Integer>L1 = new ArrayList<Integer>();
			for(int x=2;x<list.length;x++)
				L1.add(list[x]);
			Collections.sort(L1);
			Collections.reverse(L1);
			//result after first move
			int turns = 0;
			L1 = move(L1);turns++;
			set.add(L1);
			L1 = move(L1);turns++;
			while(match(set,L1)==0)
			{
				set.add(L1);
				L1 = move(L1);turns++;
			}
			if(match(set,L1)==1)
				out.println(turns+" "+"LOSS "+L1);
			else
				out.println((turns-1)+" "+"WIN "+L1);
		}
	}
}
/*
Test Input File – stones.dat
5
12 4 1 6 3 2
28 5 2 8 4 5 9
36 7 10 6 4 1 2 4 9
8 1 8
10 4 4 3 2 1

Test Output To Screen
6 LOSS [5, 4, 2, 1]
17 WIN [7, 6, 5, 4, 3, 2, 1]
45 WIN [8, 7, 6, 5, 4, 3, 2, 1]
8 LOSS [4, 3, 1]
1 WIN [4, 3, 2, 1]

*/