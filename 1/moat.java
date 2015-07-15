import java.util.*;
import java.io.*;

public class moat {

  public static void main(String[] args) throws IOException {
      Scanner f = new Scanner(new File("moat.dat"));
      int n = f.nextInt();
      f.nextLine();
      while(n-->0) {
        String s = f.nextLine();
        int mp = 0;
        for(int i = 0;i < s.length();i += 2) {
          if(s.charAt(i) == 'A') {
            mp += 15;
          }
          else if(s.charAt(i) == 'J' || s.charAt(i) == 'Q' || s.charAt(i) == 'K') {
            mp += 12;
          }
          else if(s.charAt(i) == '0') {
            mp += 10;
          }
          else {
            mp += s.charAt(i) - 48;
          }
        }
        System.out.println(mp);
      }
  }

}
