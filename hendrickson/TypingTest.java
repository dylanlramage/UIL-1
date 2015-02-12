import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class TypingTest {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("typingtest.dat"));
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i < n;i++) {
        	int sec = scan.nextInt();
        	String line = scan.nextLine().trim();
        	String[] arr = line.split(" ");
        	int w = arr.length;
        	float d = (float)w / (float)sec;
        	out.println(Math.round((d * (float)60)) + " WPM");
        }
    }
}