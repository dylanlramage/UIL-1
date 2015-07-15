import java.util.*;
import java.io.*;

public class word {

  public static void main(String[] args) throws IOException {
      Scanner f = new Scanner(new File("word.dat"));
      while(f.hasNext()) {
        int h = f.nextInt();
        int t = (int)Math.ceil((h / 3.0) * 2);
        double cost = 0.0;
        if(h >= 100) {
          cost += h * .08;
        }
        else if(h > 40) {
          cost += 40 * .1;
          cost += (h - 40) * .09;
        }
        else {
          cost += h * .1;
        }
        if(t > 50) {
          cost += 50 * .35;
          cost += (t - 50) * .27;
        }
        else {
          cost += t * .35;
        }
        System.out.printf("$%.2f\n", cost);
      }
  }

}
