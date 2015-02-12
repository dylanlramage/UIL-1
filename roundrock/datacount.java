import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class datacount {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("datacount.dat"));
        long count = 0;
        while(scan.hasNext()) {
        	scan.nextLine();
        	count++;
        }
        out.println("THERE ARE " + count + " LINES OF DATA IN THIS FILE");
    }
}
