package ArrayList;

import java.util.*;

public class RotateAnArray {
	static void reverse(ArrayList<Integer> arr,int start, int end  ) {
		while(start<end){
			int tmp1=arr.get(start);
			int tmp2=arr.get(end);
			arr.set(start, tmp2);
			arr.set(end, tmp1);
			start++;
			end--;
		}
	}
	public static void main(String[] Args) {
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		System.out.println(arr);
//		
//		
//		int start=0; 
//		int times=7;
//		
//		if(times>arr.size()) {
//			times = times % arr.size();
//		}
//		
////		while(times>arr.size()) { //........2nd method but it is not optimized because its using loop..............
////			times-=5;
////		}
//		
//		int end=arr.size()-1;
//		reverse(arr, start, times);
//		reverse(arr, times+1,end);
//		reverse(arr, start,end);
//
//		System.out.println(arr);
		
		System.out.println(7%3);
		
		
	}
}
