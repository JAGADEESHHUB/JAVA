package Arraydequque;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Vaildparenthesis {

	public static void main(String[] args) {
     String word=")((()())))";
     char ar[]=word.toCharArray();   
     
		ArrayDeque<Character> arr=new ArrayDeque<Character>();
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]=='(') {
				arr.push(ar[i]);
			}
			else {
				
				if (!arr.isEmpty()) {
                    arr.pop();
                } else {
                    System.out.println("invalid");
                    return;
                }
			}
		}   
		
		if(arr.isEmpty()==true) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
     
	}

}























// innu oru pop pannanum but panna mudiyala adhunala stack empty  achu so idhu invalid.....
