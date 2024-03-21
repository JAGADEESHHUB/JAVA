package Hashset;
import java.util.*;
//(contains) we will good in Hashset
public class Hashset {

	public static void main(String[] args) {
	    HashSet<Integer> arr=new HashSet<Integer>(); 
	    
	    //(add)	It is used to add the specified element to this set if it is not already present
	    arr.add(1);
	    arr.add(1);
	    arr.add(2);
	    arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    arr.add(1);
	    arr.add(5);
	    
	    
	    //(isEmpty) It is used to return true if this set contains no elements. [boolean]
	    System.out.println(arr.isEmpty());
	    
	    //(contains) It is used to return true if this set contains the specified element. [boolean]
	    System.out.println(arr.contains(3));
	    System.out.println(arr.contains(0));
	    
	    
	    //(remove) It is used to remove the specified element from this set if it is present.
	    arr.remove(1);
	    
	    //(iterator)
	    Iterator<Integer> h=arr.iterator();
	    while(h.hasNext()) {
	    	System.out.println(h.next());
	    }
	    
	    //(clear) It is used to remove all of the elements from the set.
	    arr.clear();
	    
	    //(clone) It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
	    System.out.println();
	    arr.add(5);// suma adding 5 for showing...
	    HashSet<Integer> clone=new HashSet<Integer>();
	    clone=(HashSet)arr.clone();
	    Iterator<Integer> h1=clone.iterator();
	    while(h1.hasNext()) {
	    	System.out.println(h1.next());
	    }

	    
	    


	}

}
