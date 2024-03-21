package Arraydequque;

import java.util.*;

public class ReverseAnArray {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		System.out.println(arr);
		
		
		ArrayDeque<Integer> arr1=new ArrayDeque<Integer>();
		for(int i=0; i<arr.size(); i++) {
			arr1.push(arr.get(i));
		}
		
		
		int ss=arr1.size();/*(size of ArrayDeque we storing it because when ever we do any remove oR add operation
		                      the size will get change so storing the size before is optimal way*/
		for(int i=0; i<ss; i++) {
			arr.set(i, arr1.pop());
		}
		
		System.out.println(arr);
	}

}
