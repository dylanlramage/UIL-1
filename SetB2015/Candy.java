import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Candy {
    
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("candy.dat"));
        int n = f.nextInt();
        while(n-- > 0) {
            int num = f.nextInt();
            int a = f.nextInt();
            num--;
            int tl = -1;
            while(num -- > 0) {
                int b = f.nextInt();
                int g = gcd(a, b);
                tl = a * b / g;
                a = tl;
            }
            out.println(tl);
        }
    }
    
   public static int gcd(int as, int bs) {
       while(as != bs) {
           if(as > bs)
               as = as - bs;
           else
               bs = bs - as;
       }
       return as;
   }
}