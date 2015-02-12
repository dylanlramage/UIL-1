import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class base {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("file.dat"));
		int n = scan.nextInt();
		scan.nextLine();
		// initialize variables to zero here
		for(int i = 0;i < n;i++) //cycle through number of cases. if no n: while(scan.hasNext())
		{
			//read with scanner methods
			//scan.nextLine(), scan.nextInt(), scan.nextDouble()
			//break up data, interpret using .trim() or .split()
			//logic, beef of the code, conditions, algorithm
			//print out output, formatted exactly as wanted
			//set everything back to zero, clear everything
		}
	}
}
//3 Steps to Most/All Problems:
//reading in data
//interpreting or manipulating data
//output