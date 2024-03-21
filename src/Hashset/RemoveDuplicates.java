package Hashset;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		System.out.println(arr);
		
		HashSet<Integer> arr2 = new HashSet<Integer>();
		
		for(int i=0; i<arr.size(); i++) {
			arr2.add(arr.get(i));
		}
		
		System.out.println(arr2);

	}

}
