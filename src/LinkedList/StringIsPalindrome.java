package LinkedList;

import java.util.*;

public class StringIsPalindrome {

	static boolean palindrome(String s) {
		char[] ch = s.toCharArray();
		LinkedList<Character> ll = new LinkedList<>();

		for (char x : ch) {
			if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
				ll.add(x);
			}
		}

		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i) >= 'A' && ll.get(i) <= 'Z') {
				ll.set(i, (char) (ll.get(i) + 32));
			}
		}

		LinkedList<Character> clone = (LinkedList<Character>) ll.clone();
		
		Collections.reverse(clone);

		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i) != clone.get(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		String s="A man, a plan, a canal: Panama";
		String d="race a car";
		
		System.out.println(palindrome(s));
		System.out.println(palindrome(d));

	}

}
