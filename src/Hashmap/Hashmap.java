package Hashmap;
import java.util.*;
// good for duplicate,missing
public class Hashmap {

	public static void main(String[] args) {
			
		   HashMap<Integer, String> map = new HashMap<>();

	        // Adding key-value pairs to the map
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        System.out.println(map);

	        System.out.println();
	        // Getting value associated with key 2
	        /*Dynamic return type*/String valueForKey2 = map.get(2);
	        System.out.println("Value for key 2: " + valueForKey2); // Output: Two
	        System.out.println(map);

	        System.out.println();
	        // Checking if map contains key 4
	        boolean containsKey4 = map.containsKey(4);
	        boolean containsKey3 = map.containsKey(3);
	        System.out.println("Contains key 4: " + containsKey4); // Output: false
	        System.out.println("Contains key 3: " + containsKey3); // Output: true
	        System.out.println(map);
	        
	        System.out.println();
	        // Checking if map contains key 4
	        boolean containsvalue4 = map.containsValue("kim");
	        boolean containsvalue3 = map.containsValue("one");
	        System.out.println("Contains value 4: " + containsvalue4); // Output: false
	        System.out.println("Contains value 3: " + containsvalue3); // Output: true
	        System.out.println(map);

	        
	        System.out.println();
	        // Removing key-value pair for key 1(it removes and also returns the removed value)
	        /*Dynamic return type*/String removedValue = map.remove(1);
	        System.out.println("Removed value for key 1: " + removedValue); // Output: One
	        System.out.println(map);

	        
	        System.out.println();
	        // Getting size of the map
	        int size = map.size();
	        System.out.println("Size of the map: " + size); // Output: 2
	        System.out.println(map);

	        System.out.println();
	        // Checking if map is empty
	        boolean isEmpty = map.isEmpty();
	        System.out.println("Is map empty: " + isEmpty); // Output: false
	        System.out.println(map);

	        System.out.println();
	        // Clearing the map
	        map.clear();
	        System.out.println("Size after clearing: " + map.size()); // Output: 0
	        System.out.println("Is map empty after clearing: " + map.isEmpty()); // Output: true
	        System.out.println(map);

	        System.out.println();
	        // Adding key-value pairs again
	        map.put(5, "Five");
	        map.put(6, "Six");
	        System.out.println(map);

	        System.out.println();
	        // Getting key set
	        Set<Integer> keyset = map.keySet();
	        System.out.println("Key set: " + keyset); // Output: [5, 6]
	        System.out.println(map);

	        System.out.println();
	        // Getting values
	        Collection<String> values = map.values();
	        System.out.println("Values: " + values); // Output: [Five, Six]
	        System.out.println(map);

	        System.out.println();
	        // Getting entry set
	        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
	        System.out.println("Entry set: " + entrySet); // Output: [5=Five, 6=Six]
	        System.out.println(map);
	}

}