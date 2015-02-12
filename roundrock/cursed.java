import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class cursed {

    public static void main(String[] args) throws IOException {
        	Scanner scan = new Scanner(new File("cursed.dat"));
        	int count = 0;
	        while(scan.hasNext()) {
	        	String line = scan.nextLine();
	        	String result = "";
	        	if(line.contains("Jan")) {
	        		result += "01";
	        	}
	        	if(line.contains("Feb")) {
	        		result += "02";
	        	}
	        	if(line.contains("Mar")) {
	        		result += "03";
	        	}
	        	if(line.contains("Apr")) {
	        		result += "04";
	        	}
	        	if(line.contains("May")) {
	        		result += "05";
	        	}
	        	if(line.contains("Jun")) {
	        		result += "06";
	        	}
	        	if(line.contains("Jul")) {
	        		result += "07";
	        	}
	        	if(line.contains("Aug")) {
	        		result += "08";
	        	}
	        	if(line.contains("Sep")) {
	        		result += "09";
	        	}
	        	if(line.contains("Oct")) {
	        		result += "10";
	        	}
	        	if(line.contains("Nov")) {
	        		result += "11";
	        	}
	        	if(line.contains("Dec")) {
	        		result += "12";
	        	}
	        	String[] arr = line.split(" ");
	        	if(arr[1].length() == 2) {
	        		result += "0";
	        	}
	        	if(arr[1].length() == 2) {
	        		result += arr[1].charAt(0);
	        	}
	        	if(arr[1].length() == 3) {
	        		result += arr[1].substring(0, 2);
	        	}
	        	if(arr[2].length() == 3) {
	        		result += "0";
	        	}
	        	if(arr[2].length() == 2) {
	        		result += "00";
	        	}
	        	if(arr[2].length() == 1) {
	        		result += "000";
	        	}
	        	result += arr[2];
	        	out.print(result + ": ");
	        	String first = result.substring(0, 4);
	        	String end = "";
	        	for(int j = result.length() - 1;j >= result.length()/2;j--) {
	        		end += result.charAt(j);
	        	}
	        	if(first.equals(end)) {
	        		out.println("DON'T TRAVEL");
	        	}
	        	else {
	        		out.println("OK TO TRAVEL");
	        	}
	        }
        }
}
