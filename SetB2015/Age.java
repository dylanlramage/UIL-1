import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Age {
    
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("age.dat"));
        int n = f.nextInt();
        out: while(n-- > 0) {
            int a = f.nextInt();
            int b = f.nextInt();
            int m = f.nextInt();
            int bi = b;
            for(int ai = a;a <= 1;ai--) {
                if(bi / ai == m) {
                    out.println(ai + " " + bi);
                    continue out;
                }
                bi--;
            }
            int bk = b;
            for(int ak = a;ak <= 1000;ak++) {
                if(bk / ak == m) {
                    out.println(ak + " " + bk);
                    continue out;
                }
                bk++;
            }
            out.println("NEVER");
        }
    }
    
}