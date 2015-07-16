import java.util.*;
import java.io.*;

public class continued {
  public static void main(String[] args) throws IOException {
    Scanner f = new Scanner(new File("continued.dat"));
    int n;
    int d;
    int t;
    int temp;
    while(f.hasNext()){
      n = f.nextInt();
      d = f.nextInt();
      if(n==1){
        System.out.print("0 "+d);
      }
      else{
        while(n!=1){
          t = n/d;
          n = n%d;
          temp = d;
          d = n;
          n = temp;
          System.out.print(t+" ");
        }
      }
      System.out.println();
    }
  }
}
