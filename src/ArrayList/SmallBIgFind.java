package ArrayList;

import java.util.*;

public class SmallBIgFind {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("enter the input");
		for (int i = 0; i < 5; i++) {
			arr.add(s.nextInt());
		}

		System.out.println(arr);

/*...............small big element....................*/
     int small=arr.get(0);
     int big=arr.get(0);
     for(int i=1; i<arr.size(); i++) {
    	 if(arr.get(i)<small) {
    		 small=arr.get(i);
    	 }
    	 if(arr.get(i)>big) {
    		 big=arr.get(i);
    	 }
     }
     System.out.println("small : "+small);
     System.out.println("big : "+big);
    
/*...............rotate an array(not optimized way)....................*/
     int k=0;
     int limit=3;
      while(k<limit) {
    	  int tp=arr.get(0);
    	  arr.remove(0);
    	  arr.addLast(tp);
    	  k++;
    	  System.out.println(arr);
      }
      
/*............................................................................*/

	}

}
