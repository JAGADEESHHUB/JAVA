package Hashmap;

import java.util.*;

public class FindMissingElement {

	public static void main(String[] args) {
		int ar[] = { -1, 5, 3, 2 };
		Arrays.sort(ar);
		int start = ar[0];
		int end = ar[ar.length - 1];

		HashMap<Integer, Integer> hm = new HashMap<>();

		while (start <= end) {
			hm.put(start, 1);
			start++;
		}
		System.out.println(hm);

		for (int i = 0; i < ar.length; i++) {
			if (hm.containsKey(ar[i])) {
				hm.put(ar[i], 0);
			}
		}
		System.out.println(hm);

		Set<Map.Entry<Integer, Integer>> jag = hm.entrySet();
		for (Map.Entry<Integer, Integer> jg : jag) {
			if (jg.getValue() == 1)
				System.out.println(jg.getKey());
		}

	}

}
