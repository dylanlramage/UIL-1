import java.io.*;
import java.util.*;

public class One {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("one.dat"));
		int n = scan.nextInt();
		int m = 0;
		for(int i = 0;i < n;i++)
		{
			m = scan.nextInt();
			for(int j = 1;j <= m;j++)
			{
				if(j == m)
				{
					if(j % 3 == 0)
					{
						System.out.print(5);
					}
					else
					{
						System.out.print(j);
					}
				}
				else
				{
					if(j % 3 == 0)
					{
						System.out.print(5 + ", ");
					}
					else
					{
						System.out.print(j + ", ");
					}
				}
			}
			System.out.println();
		}
	}
}