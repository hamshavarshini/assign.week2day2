package assign.week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Paypal {

	public static void main(String[] args) {
		String value = "PayPal India";
		String tex1 = value.toLowerCase();
		String tex2 = tex1.replaceAll("\\s", "");
		char[] Array = tex1.toCharArray();
		Set<Character>uniqueset = new LinkedHashSet<Character>();
		Set<Character>duplicateset = new LinkedHashSet<Character>();
		for (char c : Array) {
			boolean add = uniqueset.add(c);
			if(add == false)
			{
				duplicateset.add(c);
			}
			
		}
System.out.println(" THE DUPLICATE LETTERS ARE "+duplicateset);
uniqueset.removeAll(duplicateset);
System.out.println(" AFTER REMOVAL OF DUPLICATES : "+uniqueset);
	}

}
