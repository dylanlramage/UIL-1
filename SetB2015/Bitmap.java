import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Bitmap {
    
    public static void main(String[] args) throws IOException {
        Scanner f = new Scanner(new File("bitmap.dat"));
        int r = f.nextInt();
        int c = f.nextInt();
        boolean b = false;
        int area = 0;
        int[][] g = new int[r][c];
        for(int j = 0;j < r;j++) {
            String s = f.nextLine();
            for(int i = 0;i < c;i++) {
                g[j][i] = Integer.parseInt(s.substring(i, i + 1));            
            }
        }
        
    }
    
}