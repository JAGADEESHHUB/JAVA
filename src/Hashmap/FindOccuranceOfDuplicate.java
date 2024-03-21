package Hashmap;

import java.util.*;

public class FindOccuranceOfDuplicate {

	public static void main(String[] args) {

		int ar[] = { -1, 1, 4, 7, 3, 2, 3, 4, 5, 9, 3, 2, 7, 6, 2 };//HashMap automatically removes duplicate...
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int x : ar) {
			hm.put(x, 0);
		}
		System.out.println(hm);

		for (int x : ar) {
			//if (hm.containsKey(x)) {
				hm.put(x, hm.get(x) + 1);
			//}
		}
		System.out.println(hm);

		Set<Map.Entry<Integer, Integer>> jag = hm.entrySet();
		for (Map.Entry<Integer, Integer> jg : jag) {
			System.out.println(jg.getKey() + " has occured " + jg.getValue() + " times");
		}

	}
}