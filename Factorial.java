import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Factorial {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("factorial.dat"));
        int n = scan.nextInt();
        for(int i = 0;i < n;i++) {
          double f = scan.nextDouble();
        	int z = 0;
          int c = 0;
          for(int j = 1;j < f;j++) {
              c = (int)(f/Math.pow(5, j));
              if(c == 0) {
                break;
              }
              z += c;
          }
          out.println(z);
        }
    }
}