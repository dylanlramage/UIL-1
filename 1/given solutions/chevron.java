//Chevron  
//A+ 2014

//Note:  This solution is combination of dynamically produced
//output, with some lines of hardcoded output included.

import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class chevron
{ 
	public static void chevronel(String a)
	{
		if(a.equals("corporal"))
			{
				for(int c=1;c<=4;c++)
					out.printf("%"+c+"s%"+(10-2*c)+"s\n","*","*");
				out.printf("%5s\n","*");
			}
		else
		if(a.equals("lance"))
			{
				for(int c=1;c<=2;c++)
					out.printf("%"+c+"s%"+(10-2*c)+"s\n","*","*");
				for(int c=3;c<=4;c++)
					out.printf("%"+(c)+"s%"+(10-2*c+2)+"s\n","* *","* *");

				out.printf("%7s\n%6s\n%5s\n","* * *","* *","*");
			}
		else
			{
				int c=1;
				for(c=1;c<=2;c++)
					out.printf("%"+c+"s%"+(10-2*c)+"s\n","*","*");
				for(c=3;c<=4;c++)
					out.printf("%"+(c)+"s%"+(10-2*c+2)+"s\n","* *","* *");
				c=3;
					out.printf("%"+(c)+"s%"+(10-2*c)+"s\n","* * *","* *");
				c=4;
					out.printf("%"+(c)+"s%"+(10-2*c+2)+"s\n","* *","* *");
				out.printf("%7s\n%6s\n%5s\n","* * *","* *","*");
			}

	}
	public static void chevron(String a)
	{
		int c=0;
		if(a.equals("corporal"))
			{
				for(c=1;c<=5;c++)
					out.printf("%"+(c+1)+"s%"+(10-2*c+3)+"s\n","**","**");
				c=7;
				out.printf("%"+(c+1)+"s\n","***");
				out.printf("%7s\n","*");
			}
		else
		if(a.equals("lance"))
			{
				for( c=1;c<=3;c++)
					out.printf("%"+(c+1)+"s%"+(10-2*c+3)+"s\n","**","**");
				for( c=4;c<=5;c++)
					out.printf("%"+(c+1)+"s%"+(10-2*c+6)+"s\n","** **","** **");
				c=6;
					out.printf("%"+(c-4)+"s%"+(10-2*c+6)+"s\n","","** *** **");
				c=4;
					out.printf("%"+(c-2)+"s%"+(10-2*c+6)+"s\n","","** * **");

				out.printf("%9s\n%8s\n%7s\n","** **","***","*");
			}
		else
			{
				for( c=1;c<=3;c++)
					out.printf("%"+(c+1)+"s%"+(10-2*c+3)+"s\n","**","**");
				for( c=4;c<=5;c++)
					out.printf("%"+(c+1)+"s%"+(10-2*c+6)+"s\n","** **","** **");
				c=6;
					out.printf("%"+(c-4)+"s%"+(10-2*c+6)+"s\n","","** *** **");
				c=7;
					out.printf("%"+(c-2)+"s%"+(10-2*c+6)+"s\n","** **"," * ** **");
				c=6;	
					out.printf("%"+(c)+"s%"+(10-2*c+8)+"s\n","** **","** **");
				c=6;
					out.printf("%"+(c-4)+"s%"+(10-2*c+6)+"s\n","","** *** **");
				c=4;
					out.printf("%"+(c-2)+"s%"+(10-2*c+6)+"s\n","","** * **");

				out.printf("%9s\n%8s\n%7s\n","** **","***","*");
			}

	}
	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File("chevron.dat"));
		int N = f.nextInt();
		while(N-->0)
		{
			String a=f.next();
			String b=f.next();
			if(b.equals("chevron"))
				chevron(a);
			else
				chevronel(a);
		}	
	}
}
/*

Test Input File – chevron.dat
6
sergeant chevron
corporal chevronel
lance chevronel
lance chevron
corporal chevron
sergeant chevronel

Test Output To Screen
**         **
 **       **
  **     **
** **   ** **
 ** ** ** **
  ** *** **
** ** * ** **
 ** ** ** **
  ** *** **
   ** * **
    ** **
     ***
      *
*       *
 *     *
  *   *
   * *
    *
*       *
 *     *
* *   * *
 * * * *
  * * *
   * *
    *
**         **
 **       **
  **     **
** **   ** **
 ** ** ** **
  ** *** **
   ** * **
    ** **
     ***
      *
**         **
 **       **
  **     **
   **   **
    ** **
     ***
      *
*       *
 *     *
* *   * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/