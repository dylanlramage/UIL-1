//Equality 
//A+ 2014

import static java.lang.System.*;
import java.util.*;
import java.io.*;

   public class equality
   {
      public static void main (String [] args) throws FileNotFoundException
      {
			Scanner f = new Scanner(new File("equality.dat"));
			while(f.hasNext())
			{
				int start=f.nextInt();
				int step=f.nextInt();
				int z = start;
				for(int x = 0;x<5;x++)
				{
					Integer a = z;
					Integer b = z;
					System.out.printf("%+4d == %+4d is %s\n",a,b,(a==b));
					z+=step;
				}
				out.println();
			}
      }
   }
/*
Test Data
90 10
-150 10
100 7
-130 4
125 1
-130 1

Output
 +90 ==  +90 is true
+100 == +100 is true
+110 == +110 is true
+120 == +120 is true
+130 == +130 is false

-150 == -150 is false
-140 == -140 is false
-130 == -130 is false
-120 == -120 is true
-110 == -110 is true

+100 == +100 is true
+107 == +107 is true
+114 == +114 is true
+121 == +121 is true
+128 == +128 is false

-130 == -130 is false
-126 == -126 is true
-122 == -122 is true
-118 == -118 is true
-114 == -114 is true

+125 == +125 is true
+126 == +126 is true
+127 == +127 is true
+128 == +128 is false
+129 == +129 is false

-130 == -130 is false
-129 == -129 is false
-128 == -128 is true
-127 == -127 is true
-126 == -126 is true


*/