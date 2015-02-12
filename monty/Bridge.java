import java.io.*;
import java.util.*;

public class Bridge {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("bridge.dat"));
		String[] knowledge = new String[50];
		int num = 0;
		String question = "";
		int count = 0;
		boolean alive = false;
		for(int i = 0;i < 50;i++)
		{
			knowledge[i] = scan.nextLine();
		}
		num = Integer.parseInt(scan.nextLine());
		for(int j = 0;j < num;j++)
		{
			for(int k = 0;k < 3;k++)
			{
				question = scan.nextLine();
				for(int p = 0;p < 50;p++)
				{
					if(knowledge[p].contains(question))
					{
						if(!(count < -1))
						{
							System.out.println(knowledge[p].substring(question.length() + 1, knowledge[p].length()) + ".");
						}
						count++;
						alive = true;
						break;
					}
				}
				if(!alive)
				{
					count -= 999;
				}
				alive = false;
			}
			if(count == 3)
			{
				System.out.println("Sir Robin can cross the bridge.");
				System.out.println();
				count = 0;
			}
			else
			{
				System.out.println("Sir Robin gets thrust into the pit.");
				System.out.println();
				count = 0;
			}
		}
	}
}