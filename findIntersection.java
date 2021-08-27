package assign.week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findIntersection {

	public static void main(String[] args) {
		Integer[] firstArray = {3,2,11,4,6,7};
	    Integer[] secondArray = {1,2,8,4,9,7};
	    Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        List<Integer> A1= new ArrayList<Integer>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i]==secondArray[j]) {
                    A1.add(firstArray[i]);
                }
            }
        }
        System.out.println("Intersection elements are : "+A1);
	 
}
}