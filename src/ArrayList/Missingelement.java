package ArrayList;

import java.util.*;

public class Missingelement {

	public static void main(String[] args) {
		int arr[] = { -1, 5, 3, 2 };
		
		Integer ar[]=new Integer[arr.length];
		for(int i=0; i<arr.length; i++) {
			ar[i]=arr[i];
		}

		Arrays.sort(ar);

		int start = ar[0];
		int end = ar[ar.length - 1];

		ArrayList<Integer> al = new ArrayList<>();
		while (start <= end) {
			al.add(start);
			start++;
		} 
		

		for (int i = 0; i < ar.length; i++) {
			al.remove(ar[i]);//passing object...
		}

		System.out.println(al);

	}

}
