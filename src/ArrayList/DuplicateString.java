package ArrayList;

import java.util.*;

public class DuplicateString {

	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("jaga");
		arr.add("loki");
		arr.add("anan");
		arr.add("anan");
		arr.add("anan");
		arr.add("ash");
		arr.add("jaga");
		arr.add("loki");
		System.out.println(arr);

		Collections.sort(arr);
		System.out.println(arr);

		for (int c = 0; c < arr.size(); c++) {
			for (int i = 0; i + 1 < arr.size(); i++) {
				if (arr.get(i) == arr.get(i + 1)) {
					arr.remove(i);
				}
			}
		}
		System.out.println(arr);

	}

}
