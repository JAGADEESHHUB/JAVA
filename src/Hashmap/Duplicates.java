package Hashmap;

import java.util.Arrays;
import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
		int arr[] = { -1, 2, 2, 1, 2, 3, 4, 5, 7 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!(hm.containsKey(arr[i]))) {
				hm.put(arr[i], 1);
			} else {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
		}

		System.out.println(hm);

		Set<Map.Entry<Integer, Integer>> jag = hm.entrySet();
		for (Map.Entry<Integer, Integer> jg : jag) {
			if (jg.getValue() > 1)
				System.out.println(jg.getKey() + " " + jg.getValue());
		}
	}
}

