import java.io.*;
import java.util.*;

public class continued {

  public static void main(String[] args) throws IOException {
      Scanner f = new Scanner(new File("continued.dat"));
      while(f.hasNextInt()) {
        int n = f.nextInt();
        int d = f.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        do {
          arr.add(n/d);
          n = n%d;
          int t = n;
          n = d;
          d = t;
        } while(n != 1);
        for(int x:arr) {
          System.out.print(x + " ");
        }
        System.out.println();
      }
  }

}
