import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class InsertionSort {
	
	public static void main(String args[]) {
		InsertionSort sorter = new InsertionSort();
		Scanner scan = new Scanner(in);
		int[] array = new int[10];
		for(int i = 0;i < 10;i++) {
			array[i] = (int)(Math.random()*100);
		}
		for(int k:array) {
			out.print(k + " ");
		}
		out.println();
		array = sorter.sort(array);
		for(int k:array) {
			out.print(k + " ");
		}
		out.println();
	}

	private int[] sort(int[] arr) {
		for(int i = 1;i <= arr.length - 1;i++) {
			int j = i;
			while(j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		return arr;
	} 
}