import java.io.*;
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       	ArrayList<Integer> nums = new ArrayList<Integer>();
       	String u = "";
		while(true)
		{
			System.out.println("Type a number or [refuse] to");
			u = scan.nextLine();
			if(u.equals("refuse"))
			{
				break;
			}
			else
			{
				nums.add(Integer.parseInt(u));
			}
		}
       	System.out.println("Here are the numbers sorted: " + sort(nums));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> nums) {
    	int temp = 0;
    	ArrayList<Integer> nums1 = nums;
    	for(int i = 0; i < nums1.size();i++)
       	{
       		for(int j = i + 1;j < nums1.size();j++)
       		{
       			if(nums1.get(i) > nums1.get(j))
       			{
       				temp = nums1.get(i);
       				nums1.set(i, nums1.get(j));
       				nums1.set(j, temp);
       			}
       		}
       	}
       	return nums1;
    }

}
