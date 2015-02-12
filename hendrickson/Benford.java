import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Benford {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("benford.dat"));
        int n = scan.nextInt();
        for(int i = 0;i < n;i++) {
        	int ni = scan.nextInt();
        	scan.nextLine();
        	int[] cnt = new int[10];
        	for(int j = 0;j < ni;j++) {
        		String line = scan.nextLine();
        		cnt[Integer.parseInt(line.substring(0, 1))]++;
        	}
        	if((cnt[1] / (double)ni >= .25 && cnt[1] / (double)ni <= .35)) {
        		out.println("PASSED");
        	}
        	else {
        		System.out.printf("%s%.2f%%\n", "FAILED: ", (cnt[1] / (double)ni) * 100);
        	}
        }
    }
}