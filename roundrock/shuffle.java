import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class shuffle {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("shuffle.dat"));
        boolean in = false;
       while(scan.hasNext()) {
       		String line = scan.nextLine();
       		ArrayList<String> arr = new ArrayList<String>();
       		String[] a = line.split(" ");
       		for(int i = 0;i < a.length;i++) {
       			if(arr.size() > 0) {
       				for(int j = 0;j < arr.size();j++) {
       					if(arr.get(j).equals(a[i])) {
       						in = true;
       						break;
       					}
       				}
       				if(!in) {
       					arr.add(a[i]);
       				}
       			}
       			else {
       				arr.add(a[i]);
       			}
       			in = false;
       		}
       		Collections.sort(arr);
       		for(int p = 0;p < arr.size();p++) {
       			out.print(arr.get(p) + " ");
       		}
       		out.println();
       }
    }
}
