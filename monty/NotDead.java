import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class NotDead {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("notdead.dat"));
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i < n;i++) {
            if(scan.nextLine().equals("<nothing>")) {
                out.println("Accepted");
            }
            else {
                out.println("Rejected");
            }
        }
    }
}