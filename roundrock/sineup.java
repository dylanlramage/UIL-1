import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class sineup {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("sineup.dat"));
        while(scan.hasNext()) {
        	int dia = scan.nextInt();
        	out.println("Circumcircle diameter = " + dia);
        	int[] angle = new int[3];
        	for(int i=0; i<3; i++){
        		if(i != 2)
        			angle[i] = scan.nextInt();
        		else{
        			angle[2] = 180 - (angle[0] + angle[1]);
        		}
        	}
        	out.println("Angles are " + angle[0] + ", " + angle[1] + " and " + angle[2]);
        	out.printf("Corresponding sides are %d, %d and %d",
        	Math.round((float)(dia*Math.sin(Math.toRadians(angle[0])))), Math.round((float)(dia*Math.sin(Math.toRadians(angle[1])))),
        	Math.round((float)dia*Math.sin(Math.toRadians(angle[2]))));
        	out.println();
        }
    }
}
