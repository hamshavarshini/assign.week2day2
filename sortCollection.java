package assign.week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortCollection {

	public static void main(String[] args) {
	String arr[] = {"Google"," Microsoft","TestLeaf"," Maverick"};
List<String>list = new ArrayList<String>(Arrays.asList(arr));
System.out.println(list);
Collections.reverse(list);
System.out.println(" REVERSED LIST");
System.out.println(list);

}
	}


