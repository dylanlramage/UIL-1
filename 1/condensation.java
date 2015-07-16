import java.util.*;
import java.io.*;

public class condensation {
  public static void main(String[] args) throws IOException {
    Scanner f = new Scanner(new File("condensation.dat"));
    String s;
    while(scan.hasNextLine()){
      s = f.nextLine();
      if(s.equals("zero")){
        s = "0"
      }
      else if(s.equals("one")){
        s = "1"
      }
      else if(s.equals("two")){
        s = "2"
      }
      else if(s.equals("three")){
        s = "3"
      }
      else if(s.equals("four")){
        s = "4"
      }
      else if(s.equals("five")){
        s = "5"
      }
      else if(s.equals("six")){
        s = "6"
      }
      else if(s.equals("seven")){
        s = "7"
      }
      else if(s.equals("eight")){
        s = "8"
      }
      else if(s.equals("nine")){
        s = "9"
      }
      else if(s.length()<4){
      }
      else{
        for(int i=0; i<s.length(); i++){
          if(i<s.length()-1){
          if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
            s = s.substring(0,i)+s.substring(i+1);
          }
          }
          if(i!=0 && i!=s.length()-1 && (s.substring(i,i+1).equals("a") || s.substring(i,i+1).equals("e") || s.substring(i,i+1).equals("i") || s.substring(i,i+1).equals("o") || s.substring(i,i+1).equals("u")){
            s = s.substring(0,i)+s.substring(i+1);
          }
        }
      }
      System.out.println(s);
    }
  }
}
