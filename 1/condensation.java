import java.util.*;
import java.io.*;

public class condensation {

  public static void main(String[] args) throws IOException {
      Scanner f = new Scanner(new File("condensation.dat"));
      while(f.hasNextLine()) {
        String s = f.nextLine();
        if(s.equals("zero")) {
          s = "0";
        }
        if(s.equals("one")) {
          s = "1";
        }
        if(s.equals("two")) {
          s = "2";
        }
        if(s.equals("three")) {
          s = "3";
        }
        if(s.equals("four")) {
          s = "4";
        }
        if(s.equals("five")) {
          s = "5";
        }
        if(s.equals("six")) {
          s = "6";
        }
        if(s.equals("seven")) {
          s = "7";
        }
        if(s.equals("eight")) {
          s = "8";
        }
        if(s.equals("nine")) {
          s = "9";
        }
        if(s.length() >= 4) {
          char temp = ' ';
          for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == temp) {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
            temp = s.charAt(i);
          }
          for(int i = 1;i < s.length() - 1;i++) {
            if(s.charAt(i) == 'a') {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
            if(s.charAt(i) == 'e') {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
            if(s.charAt(i) == 'i') {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
            if(s.charAt(i) == 'o') {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
            if(s.charAt(i) == 'u') {
              String ns = "";
              ns += s.substring(0, i);
              ns += s.substring(i + 1);
              s = ns;
              i--;
            }
          }
        }
        System.out.println(s);
      }
  }

}
