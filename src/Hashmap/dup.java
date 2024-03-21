package Hashmap;
import java.util.*;

public class dup {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 8, 12, 32, 34, 43, 52, 57, 62, 64, 67, 71, 71, 79, 81, 86, 91, 93, 94 };

		Map<Integer,Integer> hm=new LinkedHashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], 0);
		}
		
		System.out.println(hm);
		
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], hm.get(arr[i])+1);
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<Integer,Integer>> jag=hm.entrySet();
		for(Map.Entry<Integer,Integer> jg:jag) {
			if(jg.getValue()==1) {
				System.out.println(jg.getKey());
			}
		}
		
		
	}

}
