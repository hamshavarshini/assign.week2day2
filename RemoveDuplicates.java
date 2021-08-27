package assign.week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = " We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> unique = new LinkedHashSet<String>();
		for (String eachWord : words) 
		{
			unique.add(eachWord);
		}
		for (String wd : unique) 
		{
			System.out.println(wd + " ");
		}
	}
}
