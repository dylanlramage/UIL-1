import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Witch {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("witch.dat"));
        int n = scan.nextInt();
        for(int i = 0;i < n;i++) {
            if(scan.nextDouble() == scan.nextDouble()) {
                out.println("WITCH!");
            }
            else {
                out.println("NOT A WITCH!");
            }
        }
    }
}