import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class hollowfloyd {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("hollowfloyd.dat"));

        while(scan.hasNext()) {
        	int i= scan.nextInt();
        	char[][] grid = new char[i][i];
        	int index = 0;
           	for(int r=0; r<i; r++){
           		for(int c=0; c<i; c++){
           			if(c == 0)
           				grid[r][c] = '*';
           			grid[index][index] = '*';

           			if(r == i -1)
           				grid[r][c] = '*';
           		}
           		index++;
           	}
           	for(int r=0; r<i; r++){
           		for(int c=0; c<i; c++){
           			out.print(grid[r][c]);
           		}
           		out.println();
           	}
        }
      }
 }
