package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		System.out.println(arr);

		Collections.sort(arr);

		for (int c = 0; c < arr.size(); c++) {
			for (int i = 0; i + 1 < arr.size(); i++) {
				if (arr.get(i) == arr.get(i + 1)) {
					arr.remove(i);
				}
			}
		}
		System.out.println(arr);

	}
	
	//1234567
	
	//1234567
	
	

}
