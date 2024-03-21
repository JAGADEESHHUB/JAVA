package JavaRegex;

import java.util.*;
import java.util.regex.*;

public class JavaRegex {

	public static void main(String[] args) {

		String h="is jaga good need";
		String o="jaga";
		Pattern p=Pattern.compile(o);
		Matcher m=p.matcher(h);
		while(m.find()==true) {  
			//System.out.println(m.group());
			System.out.println(m.start());
			//System.out.println(m.end());

		
		
		
	}

	}}
