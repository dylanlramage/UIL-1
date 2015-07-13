import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Trapped
{
	private static int[][] mat=new int[10][10];
	private static boolean madeit=false;
	
	public static void main(String[] args)throws IOException
	{
		int a,b,c,d,e,f,g;
		double time,total;
		String s,s1,s2;
		String [] t;
		int[][] mat1=new int[10][10];

		boolean bad;
		
		Scanner input = new Scanner(new File("trapped.dat"));
		PrintWriter output = new PrintWriter(new File("trapped.out"));		
		
		for(c=0;c<10;c++) //read in array
		{
			
			s=input.nextLine();			
			for(d=0;d<10;d++)
			{				
				mat1[c][d]=mat[c][d]=s.charAt(d)-'0';				
			}						
		}
		s=input.nextLine();
		a=Integer.parseInt(s);
		for(b=0;b<a;b++)	
		{
			madeit=false;
			
			s=input.nextLine();
			t=s.split("\\s+");
			e=Integer.parseInt(t[0]);
			f=Integer.parseInt(t[1]);
			
			maze(e,f);
			if(!madeit)
			{
				out.println("Need a chopper!");
				output.println("Need a chopper!");
			}
			 
			else
			{
				out.println("I made it!");
				output.println("I made it!");
			}
			  			
						
			mat= new int[10][10]; //new array for next data
			for(c=0;c<10;c++)
			{
				for(d=0;d<10;d++)
				{mat[c][d]=mat1[c][d];}
			}			
		}
		
		output.close();
		input.close();	
		
	}
	public static void maze(int x,int y)
	{
		int previous=mat[x][y];
		if(x==0 || x==9 || y==0 || y==9)
		{			
			madeit=true;
		}
		else if(mat[x][y]>0 && !madeit)
		{
			mat[x][y]=-1;
			//output();
			if(Math.abs(mat[x-1][y]-previous)<2) //up
			 maze(x-1,y);
			if(Math.abs(mat[x+1][y]-previous)<2) //down
			 maze(x+1,y);
			if(Math.abs(mat[x][y-1]-previous)<2) //left
			 maze(x,y-1);
			if(Math.abs(mat[x][y+1]-previous)<2) //right
			 maze(x,y+1);
		}
		
		
	}
	public static void output()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				out.print(mat[i][j]);
				
			}
			out.println();
		}
		out.println();
	}
}