import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class SquareRoot {

    public static void main(String[] args) {
        int[] ps = {1, 4 , 9, 16, 25, 36, 49, 64, 81, 100, 121, 144};
        int[] roots = new int[12];
        for(int i = 0;i < 12;i++) {
            if(ps[i] == 1) {
                roots[i] = 1; continue;
            }
            int[] arr = new int[(ps[i]/2) + 1];
            for(int j = 2; j <= ps[i]/2;j++) {
                arr[j] = j;
            }
            int max = arr.length - 1;
            int min = 0;
            while(min <= max) {
                int guess = (max + min)/2;
                if(arr[guess] * arr[guess] == ps[i]) {
                    roots[i] = arr[guess];
                    break;
                }
                else if(arr[guess] * arr[guess] < ps[i]) {
                    min = guess + 1;
                }
                else {
                    max = guess - 1;
                }
            }
        }
        out.println(Arrays.toString(roots));
    }
    
}