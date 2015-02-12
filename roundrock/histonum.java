import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class histonum {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("histonum.dat"));
        int[] counts = new int[10];
        while(scan.hasNext()) {
        	String line = scan.nextLine();
        	for(int i = 0;i < line.length();i++) {
        		counts[Integer.parseInt(line.substring(i, i + 1))]++;
        	}
        }
        for(int j = 0;j < 10;j++) {
        	if(counts[j] != 0) {
        		out.print(j + "|");
        		for(int p = 0;p < counts[j];p++) {
        			out.print("*");
        		}
        		out.println();
        	}
        }
    }
}
