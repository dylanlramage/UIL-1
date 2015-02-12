import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class SpanishQuiz {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("spanishquiz.dat"));
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<String> ca = new ArrayList<String>();
        ca.add("Mexico D.F.");
        ca.add("Guatemala");
        ca.add("Tegucigalpa");
        ca.add("San Salvador");
        ca.add("Managua");
        ca.add("San Jose");
        ca.add("Panama");
        ca.add("Caracas");
        ca.add("Bogota");
        ca.add("Quito");
        ca.add("Lima");
        ca.add("La Paz");
        ca.add("Asuncion");
        ca.add("Santiago");
        ca.add("Buenos Aires");
        ca.add("Montevideo");
        ca.add("Brasilia");
        ArrayList<String> co = new ArrayList<String>();
        co.add("Mexico");
        co.add("Guatemala");
        co.add("Honduras");
        co.add("El Salvador");
        co.add("Nicaragua");
        co.add("Costa Rica");
        co.add("Panama");
        co.add("Venezuela");
        co.add("Colombia");
        co.add("Ecuador");
        co.add("Peru");
        co.add("Bolivia");
        co.add("Paraguay");
        co.add("Chile");
        co.add("Argentina");
        co.add("Uruguay");
        co.add("Brazil");
        for(int i = 0;i < n;i++) {
        	String line = scan.nextLine();
			if(line.contains("country")) {
				for(int j = 0;j < ca.size();j++) {
					if(line.contains(ca.get(j)))
					{
						out.println(ca.get(j) + " is the capital city of " + co.get(j) + ".");
					}
				}
			}
			else {
				for(int p = 0;p  < co.size();p++) {
					if(line.contains(co.get(p))) {
						out.println(ca.get(p) + " is the capital city of " + co.get(p) + ".");
					}
				}
			}
        }
    }
}