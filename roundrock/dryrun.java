import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class dryrun {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("dryrun.dat"));
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i < n;i++) {
        	out.println("I like " + scan.nextLine() + ".");
        }
    }
}
