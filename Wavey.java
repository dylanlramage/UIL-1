import java.util.*;
import java.io.*;

public class Wavey{
public static void main(String[] args) throws IOException{
  Scanner f = new Scanner(new File("wavey.dat"));
  int x = f.nextInt();
  f.nextLine();
  String word;
  for (int i = 0; i < x; i++){
    word = f.nextLine();
    char[][] arr = new char[word.length()][word.length()*4-3];
    for(int j = 0; j<word.length(); j++){
      arr[j][j]=word.charAt(j);
    }
    int count = word.length()-1;
    for(int k = word.length()-1; k>=0; k--){
      arr[k][count++]=word.charAt(k);
    }
    count--;
    for(int l = 0; l<word.length(); l++){
      arr[l][count++] = word.charAt(l);
    }
    count--;
    for(int g = word.length()-1; g>=0; g--){
      arr[g][count++]=word.charAt(g);
    }
    for(int h = 0; h<word.length(); h++){
      for(int d = 0; d<4*word.length()-3; d++){
          System.out.print(arr[h][d]);
      }
      System.out.println();
    }
    System.out.println();
    }
  }
}
