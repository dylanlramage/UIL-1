import java.io.*;
import java.util.*;
import java.math.*;

public class Black {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("black.dat"));
		int numOfSets = scan.nextInt();
		scan.nextLine();
		String line = "";
		for(int i = 0;i < numOfSets;i++)
		{
			line = scan.nextLine();
			BigInteger bi = new BigInteger(line);
			BigInteger bi2 = new BigInteger("190");
			BigInteger result = bi.multiply(bi2);
			System.out.println("The Black Knight's strength is " + result.toString() + ".");
		}
	}
}